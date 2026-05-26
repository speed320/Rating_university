package ru.ystu.math.dto.output.history;

import ru.ystu.math.dto.name.NameClassesDto;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record OutputHistoryDto(
        UUID uuid,
        Instant createdAt,
        NameClassesDto nameClasses,
        List<OutputHistoryClassWrapperDto> classes
) {
}
