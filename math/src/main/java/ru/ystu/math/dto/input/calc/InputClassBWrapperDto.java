package ru.ystu.math.dto.input.calc;

import ru.ystu.math.model.NameRatingClasses;

import java.util.List;

public record InputClassBWrapperDto(
        NameRatingClasses classType,
        List<InputClassBDataDto> data
) implements ClassWrapper {
}
