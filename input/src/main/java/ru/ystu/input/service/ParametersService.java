package ru.ystu.input.service;

import jakarta.transaction.Transactional;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.ystu.input.dto.NameRoles;
import ru.ystu.input.dto.input.InputParamDto;
import ru.ystu.input.dto.output.param.OutputRatingDto;
import ru.ystu.input.dto.output.response.BatchResponseDto;
import ru.ystu.input.mapper.DtoToRabbitMapper;
import ru.ystu.input.mapper.InputParamMapper;
import ru.ystu.input.model.UserEnteredParameters;
import ru.ystu.input.repository.UserEnteredParametersRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ParametersService {
    private final UserEnteredParametersRepository userEnteredParametersRepository;
    private final DtoToRabbitMapper dtoToRabbitMapper;
    private final InputParamMapper inputParamMapper;
    private final RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange.rating}")
    private String exchangeName;

    @Value("${rabbitmq.routing-key}")
    private String routingKey;

    public ParametersService(UserEnteredParametersRepository userEnteredParametersRepository,
                             DtoToRabbitMapper dtoToRabbitMapper,
                             InputParamMapper inputParamMapper,
                             RabbitTemplate rabbitTemplate) {
        this.userEnteredParametersRepository = userEnteredParametersRepository;
        this.dtoToRabbitMapper = dtoToRabbitMapper;
        this.inputParamMapper = inputParamMapper;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Transactional
    public BatchResponseDto saveAndSend(InputParamDto inputDto, Long userId, List<NameRoles> nameRoles) {
        UUID batchId = UUID.randomUUID();

        /// test
        System.out.println("DEBUG: inputDto = " + inputDto);
        /// test
        List<UserEnteredParameters> entities = inputParamMapper.toEntities(inputDto, batchId, userId);
        /// test
        System.out.println("DEBUG: entities = " + entities);
        /// test
        userEnteredParametersRepository.saveAll(entities);

        OutputRatingDto rabbitMessage = dtoToRabbitMapper.toRabbitMessage(inputDto, batchId, nameRoles);
        rabbitTemplate.convertAndSend(exchangeName, routingKey, rabbitMessage);

        return new BatchResponseDto(batchId, "SAVED_AND_SENT");
    }

    @Transactional
    public List<UUID> getUserBatchIds(Long userId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return userEnteredParametersRepository.findBatchIdsByUserId(userId, pageable);
    }
}
