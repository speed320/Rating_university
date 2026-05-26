package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B12Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB12(
        String type,
        Double prf,
        Double kco
) implements B12Input, GroupInput {
}
