package ru.ystu.math.dto.input.calc;

import java.util.List;
import java.util.UUID;

public record InputMetaDto(
    UUID batchId,
    List<NameRoles> roles
) {
}
