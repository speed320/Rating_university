package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V32Input;

public record VGroupInputV32(
        String type,
        Double n,
        Double vo,
        Double po,
        Double npr
) implements V32Input, GroupInput {
}
