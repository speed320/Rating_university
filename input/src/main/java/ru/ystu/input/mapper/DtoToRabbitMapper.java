package ru.ystu.input.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import ru.ystu.input.dto.NameRoles;
import ru.ystu.input.dto.input.InputParamDto;
import ru.ystu.input.dto.output.param.OutputMetaDto;
import ru.ystu.input.dto.output.param.OutputPayloadDto;
import ru.ystu.input.dto.output.param.OutputRatingDto;

import java.util.List;
import java.util.UUID;

@Component
public class DtoToRabbitMapper {

    private final ObjectMapper objectMapper;

    public DtoToRabbitMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public OutputRatingDto toRabbitMessage(InputParamDto inputDto, UUID batchId, List<NameRoles> roles) {
        if(inputDto == null){
            return null;
        }

        OutputMetaDto newMeta = new OutputMetaDto(batchId, roles);

        OutputPayloadDto newPayload = null;

        if(inputDto.payload() != null){
            newPayload = objectMapper.convertValue(inputDto.payload(), OutputPayloadDto.class);
        }

        return new OutputRatingDto(newMeta, newPayload);
    }
}
