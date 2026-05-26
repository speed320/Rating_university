package ru.ystu.input.dto.output.param;

import ru.ystu.input.dto.NameRoles;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record OutputMetaDto(
    UUID batchId,
    List<NameRoles> roles
) implements Serializable {
}
