package ru.ystu.math.dto.input.calc;

import ru.ystu.math.model.NameRatingClasses;

import java.util.List;

public record InputClassVWrapperDto(
        NameRatingClasses classType,
        List<InputClassVDataDto> data
) implements ClassWrapper{
}
