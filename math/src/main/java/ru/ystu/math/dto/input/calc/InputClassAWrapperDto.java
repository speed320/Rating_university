package ru.ystu.math.dto.input.calc;

import ru.ystu.math.model.NameRatingClasses;

import java.util.List;

public record InputClassAWrapperDto(
        NameRatingClasses classType,
        List<InputClassADataDto> data
) implements ClassWrapper{
}
