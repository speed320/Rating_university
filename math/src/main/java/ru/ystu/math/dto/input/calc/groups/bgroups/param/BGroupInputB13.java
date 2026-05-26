package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B13Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB13(
        String type,
        Double cp,
        Double p
) implements B13Input, GroupInput {
}
