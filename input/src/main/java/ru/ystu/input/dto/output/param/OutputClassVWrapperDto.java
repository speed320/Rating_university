package ru.ystu.input.dto.output.param;

import ru.ystu.input.model.NameRatingClasses;

import java.util.List;

public record OutputClassVWrapperDto(
        NameRatingClasses classType,
        List<OutputClassVDataDto> data
) implements ClassWrapper {
}
