package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B31Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB31(
        String type,
        Double ut,
        Double doCount
) implements B31Input, GroupInput {
}
