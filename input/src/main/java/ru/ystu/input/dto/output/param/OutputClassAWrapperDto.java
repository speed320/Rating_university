package ru.ystu.input.dto.output.param;

import ru.ystu.input.model.NameRatingClasses;

import java.util.List;

public record OutputClassAWrapperDto(
        NameRatingClasses classType,
        List<OutputClassADataDto> data
) implements ClassWrapper {
}
