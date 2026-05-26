package ru.ystu.input.dto.output.param;

import ru.ystu.input.model.NameRatingClasses;

import java.util.List;

public record OutputClassBWrapperDto(
        NameRatingClasses classType,
        List<OutputClassBDataDto> data
) implements ClassWrapper {
}
