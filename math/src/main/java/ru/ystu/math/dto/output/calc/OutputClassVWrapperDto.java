package ru.ystu.math.dto.output.calc;

import ru.ystu.math.model.NameRatingClasses;

import java.util.List;

public record OutputClassVWrapperDto(
        NameRatingClasses classType,
        List<OutputClassVDataDto> data
) implements OutputClassWrapperDto{
}
