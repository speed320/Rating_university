package ru.ystu.input.dto.output.param;

import java.io.Serializable;

public record OutputClassADataDto(
        Integer ratingYear,
        OutputGroupADataDto groupData
) implements Serializable {
}
