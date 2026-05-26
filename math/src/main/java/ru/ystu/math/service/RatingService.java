package ru.ystu.math.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ystu.math.core.RatingCore;
import ru.ystu.math.core.model.input.MathInputRating;
import ru.ystu.math.core.model.output.MathOutputRating;
import ru.ystu.math.dto.input.calc.InputRatingDto;
import ru.ystu.math.dto.name.NameDataDto;
import ru.ystu.math.dto.input.history.InputHistoryDto;
import ru.ystu.math.dto.output.calc.OutputRatingDto;
import ru.ystu.math.dto.output.history.OutputHistoryDto;
import ru.ystu.math.mapper.*;
import ru.ystu.math.model.BatchNameGroups;
import ru.ystu.math.model.RatingResult;
import ru.ystu.math.reposiory.BatchNameGroupsRepository;
import ru.ystu.math.reposiory.RatingResultRepository;

import java.util.List;
import java.util.UUID;

@Service
public class RatingService {
    private final RatingCore ratingCore;
    private final EntityOutputMapper entityOutputMapper;
    private final MathInputMapper mathInputMapper;
    private final MathOutputEntityMapper mathOutputEntityMapper;
    private final RatingResultRepository calcResultRepository;
    private final BatchNameGroupsRepository batchNameGroupsRepository;
    private final OutputHistoryMapper outputHistoryMapper;

    public RatingService(RatingCore ratingCore,
                         EntityOutputMapper entityOutputMapper,
                         MathInputMapper mathInputMapper,
                         MathOutputEntityMapper mathOutputEntityMapper,
                         OutputHistoryMapper outputHistoryMapper,
                         RatingResultRepository calcResultRepository,
                         BatchNameGroupsRepository batchNameGroupsRepository) {
        this.ratingCore = ratingCore;
        this.entityOutputMapper = entityOutputMapper;
        this.mathInputMapper = mathInputMapper;
        this.mathOutputEntityMapper = mathOutputEntityMapper;
        this.outputHistoryMapper = outputHistoryMapper;
        this.calcResultRepository = calcResultRepository;
        this.batchNameGroupsRepository = batchNameGroupsRepository;
    }

    @Transactional
    public void calculateAndSaveRating(InputRatingDto inputRatingDto){
        final UUID batchId = inputRatingDto.meta().batchId();
        final NameDataDto names = inputRatingDto.payload().names();
        final MathInputRating mathInput = mathInputMapper.toMathCoreModel(inputRatingDto.payload());

        MathOutputRating mathResult = ratingCore.calculateRating(mathInput);
/// test
        System.out.println("DEBUG: Содержимое mathResult: " + mathResult);
/// test
        BatchNameGroups batchEntity = mathOutputEntityMapper.toBatchEntity(batchId, names);
        BatchNameGroups savedBatch = batchNameGroupsRepository.save(batchEntity);
/// test
        List<RatingResult> resultEntities = mathOutputEntityMapper.toRatingResultEntities(mathResult, savedBatch);
        System.out.println("DEBUG: Найдено результатов для сохранения: " + (resultEntities != null ? resultEntities.size() : "null"));

        if (resultEntities != null && !resultEntities.isEmpty()) {
            calcResultRepository.saveAll(resultEntities);
        } else {
            System.out.println("WARNING: Список resultEntities пуст! Проверьте маппер или логику расчета.");
        }

/// test
//        List<RatingResult> resultEntities = mathOutputEntityMapper.toRatingResultEntities(mathResult, savedBatch);
//        calcResultRepository.saveAll(resultEntities);
    }

    @Transactional(readOnly = true)
    public OutputRatingDto getRatingResult(UUID batchId){
        List<RatingResult> resultEntities = calcResultRepository.findByBatchId(batchId);

        return entityOutputMapper.toJson(resultEntities);
    }

    @Transactional(readOnly = true)
    public List<OutputHistoryDto> getHistoryRating(InputHistoryDto inputHistoryDto){
        List<BatchNameGroups> batches = batchNameGroupsRepository.findAllByIdWithResults(inputHistoryDto.batchIds());

        return batches.stream().map(outputHistoryMapper::toHistory).toList();
    }
}
