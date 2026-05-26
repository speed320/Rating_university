package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B32Input;

public record BGroupInputB32(
        String type,
        Double n,
        Double vo,
        Double po,
        Double npr
) implements B32Input, GroupInput {
}
