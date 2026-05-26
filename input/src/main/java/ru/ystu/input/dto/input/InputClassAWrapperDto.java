package ru.ystu.input.dto.input;

import ru.ystu.input.model.NameRatingClasses;

import java.util.List;

public record InputClassAWrapperDto(
        NameRatingClasses classType,
        List<InputClassADataDto> data
) implements ClassWrapper{
}
