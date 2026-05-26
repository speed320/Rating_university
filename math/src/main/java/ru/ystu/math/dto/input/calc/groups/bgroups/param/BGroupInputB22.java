package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B22Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB22(
        String type,
        Double nmp,
        Double acp,
        Double opc,
        Double acc,
        Double nbp
) implements B22Input, GroupInput {
}
