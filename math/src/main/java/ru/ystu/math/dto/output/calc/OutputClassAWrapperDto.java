package ru.ystu.math.dto.output.calc;

import ru.ystu.math.model.NameRatingClasses;

import java.util.List;

public record OutputClassAWrapperDto(
        NameRatingClasses classType,
        List<OutputClassADataDto> data
) implements OutputClassWrapperDto{
}
