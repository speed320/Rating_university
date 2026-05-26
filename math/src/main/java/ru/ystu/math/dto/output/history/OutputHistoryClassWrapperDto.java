package ru.ystu.math.dto.output.history;

import ru.ystu.math.model.NameRatingClasses;

import java.util.List;

public record OutputHistoryClassWrapperDto(
        NameRatingClasses classType,
        List<OutputHistoryYearResultDto> yearlyResult
) {
}
