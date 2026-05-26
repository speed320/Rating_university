package ru.ystu.input.dto.output.param;

import java.io.Serializable;

public record OutputClassBDataDto(
        Integer ratingYear,
        OutputGroupBDataDto groupData
) implements Serializable {
}
