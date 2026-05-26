package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A11Input;

public record AGroupInputA11(
        String type,
        Double prf,
        Double kco
) implements A11Input, GroupInput {
}
