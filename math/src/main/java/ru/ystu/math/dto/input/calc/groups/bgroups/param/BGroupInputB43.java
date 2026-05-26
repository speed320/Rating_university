package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B43Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB43(
        String type,
        Double io,
        Double iv,
        Double iz,
        Double no,
        Double nv,
        Double nz
) implements B43Input, GroupInput {
}
