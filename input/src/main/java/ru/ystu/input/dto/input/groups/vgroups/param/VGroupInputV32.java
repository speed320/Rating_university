package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V32Input;

public record VGroupInputV32(
        String type,
        Double n,
        Double vo,
        Double po,
        Double npr
) implements V32Input, GroupInput {
}
