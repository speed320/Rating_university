package ru.ystu.input.dto.output.param;

import java.io.Serializable;

public record OutputRatingDto(
        OutputMetaDto meta,
        OutputPayloadDto payload
) implements Serializable {
}
