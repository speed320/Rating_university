package ru.ystu.input.dto.input;

import ru.ystu.input.model.NameRatingClasses;

import java.util.List;

public record InputClassVWrapperDto(
        NameRatingClasses classType,
        List<InputClassVDataDto> data
) implements ClassWrapper{
}
