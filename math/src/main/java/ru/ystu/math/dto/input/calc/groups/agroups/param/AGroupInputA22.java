package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A22Input;

public record AGroupInputA22(
        String type,
        Double zkn,
        Double chpa
) implements A22Input, GroupInput {
}
