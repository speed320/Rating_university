package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B23Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB23(
        String type,
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) implements B23Input, GroupInput {
}
