package ru.ystu.input.dto.output.param;

import java.io.Serializable;

public record OutputClassVDataDto(
        Integer ratingYear,
        OutputGroupVDataDto groupData
) implements Serializable {
}
