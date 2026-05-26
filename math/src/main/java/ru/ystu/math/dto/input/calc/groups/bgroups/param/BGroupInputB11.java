package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B11Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB11(
        String type,
        Double ena,
        Double enb,
        Double eb,
        Double enc,
        Double ec
) implements B11Input, GroupInput {
}
