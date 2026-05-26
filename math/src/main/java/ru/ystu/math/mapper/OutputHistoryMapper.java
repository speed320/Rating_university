package ru.ystu.math.mapper;

import org.springframework.stereotype.Component;
import ru.ystu.math.dto.name.NameClassesDto;
import ru.ystu.math.dto.output.history.OutputHistoryClassWrapperDto;
import ru.ystu.math.dto.output.history.OutputHistoryDto;
import ru.ystu.math.dto.output.history.OutputHistoryYearResultDto;
import ru.ystu.math.model.BatchNameGroups;
import ru.ystu.math.model.NameRatingClasses;
import ru.ystu.math.model.RatingResult;
import ru.ystu.math.model.json.calc.Rating;
import ru.ystu.math.model.json.name.NameClasses;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class OutputHistoryMapper {
    public OutputHistoryDto toHistory(BatchNameGroups batchNameGroups) {
        return new OutputHistoryDto(
                batchNameGroups.getBatchId(),
                batchNameGroups.getCreatedAt(),
                mapNames(batchNameGroups.getNameGroups().getNameClasses()),
                mapToClassWrappers(batchNameGroups.getRatings())
        );
    }

    private NameClassesDto mapNames(NameClasses nameClasses) {
        if(nameClasses == null) {
            return null;
        }

        return new NameClassesDto(
                nameClasses.getA(),
                nameClasses.getB(),
                nameClasses.getV()
        );
    }

    private List<OutputHistoryClassWrapperDto> mapToClassWrappers(List<RatingResult> ratingResults) {
        if(ratingResults == null || ratingResults.isEmpty()) {
            return Collections.emptyList();
        }
        Map<String, List<RatingResult>> groupedResults = ratingResults.stream().
                collect(Collectors.groupingBy(RatingResult::getRatingClass));

        return groupedResults.entrySet().stream().map(entry ->
                buildClassWrapper(entry.getKey(), entry.getValue())).toList();
    }

    private OutputHistoryClassWrapperDto buildClassWrapper(String className, List<RatingResult> classResults) {
        NameRatingClasses classType = NameRatingClasses.valueOf(className);
        List<OutputHistoryYearResultDto> yearResults = mapToYearlyResults(classResults);

        return new OutputHistoryClassWrapperDto(classType, yearResults);
    }

    private List<OutputHistoryYearResultDto> mapToYearlyResults(List<RatingResult> yearlyResults) {

        return yearlyResults.stream().map((this::buildYearResult)).toList();
    }

    private OutputHistoryYearResultDto buildYearResult(RatingResult result) {

        return new OutputHistoryYearResultDto(
                result.getRatingYear(),
                extractFinalScore(result)
        );
    }

    private Double extractFinalScore(RatingResult result) {
        if(result == null || result.getRating() == null) {
            return null;
        }

        return result.getRating().getAssessment();
    }
}
