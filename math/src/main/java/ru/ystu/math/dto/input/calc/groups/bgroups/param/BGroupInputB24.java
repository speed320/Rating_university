package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B24Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB24(
        String type,
        Double nap,
        Double pn
) implements B24Input, GroupInput {
}
