package ru.ystu.math.dto.output.calc;

import ru.ystu.math.model.NameRatingClasses;

import java.util.List;

public record OutputClassBWrapperDto(
        NameRatingClasses classType,
        List<OutputClassBDataDto> data
) implements OutputClassWrapperDto{
}
