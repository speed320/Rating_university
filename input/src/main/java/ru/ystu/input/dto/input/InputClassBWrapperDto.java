package ru.ystu.input.dto.input;

import ru.ystu.input.model.NameRatingClasses;

import java.util.List;

public record InputClassBWrapperDto(
        NameRatingClasses classType,
        List<InputClassBDataDto> data
) implements ClassWrapper {
}
