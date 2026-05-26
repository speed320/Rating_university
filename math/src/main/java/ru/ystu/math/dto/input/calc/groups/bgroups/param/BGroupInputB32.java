package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B32Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB32(
        String type,
        Double n,
        Double vo,
        Double po,
        Double npr
) implements B32Input, GroupInput {
}
