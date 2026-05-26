package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A21Input;

public record AGroupInputA21(
        String type,
        Double zkn,
        Double chva
) implements A21Input, GroupInput {
}
