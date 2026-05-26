package ru.ystu.input.dto.output.response;

import java.util.UUID;

public record BatchResponseDto(
        UUID batchId,
        String status
) {
}
