package ru.ystu.math.dto.output.calc;

import ru.ystu.math.dto.name.NameDataDto;

import java.util.List;

public record OutputRatingDto(
        NameDataDto names,
        List<OutputClassWrapperDto> classes
) {
}
