package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A32Input;

import java.util.List;

public record AGroupInputA32(
        String type,
        List<Double> dn,
        List<Double> npr,
        Integer n
) implements A32Input, GroupInput {
}
