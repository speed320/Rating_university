package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A23Input;

public record AGroupInputA23(
        String type,
        Double cz,
        Double cv
) implements A23Input, GroupInput {
}
