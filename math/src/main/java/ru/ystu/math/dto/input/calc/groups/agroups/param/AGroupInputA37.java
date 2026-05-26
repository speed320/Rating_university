package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A37Input;

public record AGroupInputA37(
        String type,
        Double ozg
) implements A37Input, GroupInput {
}
