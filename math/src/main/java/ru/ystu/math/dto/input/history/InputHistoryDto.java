package ru.ystu.math.dto.input.history;

import java.util.List;
import java.util.UUID;

public record InputHistoryDto(
        List<UUID> batchIds
) {
}
