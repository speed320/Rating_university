package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A33Input;

import java.util.List;

public record AGroupInputA33(
        String type,
        List<Double> rdn,
        List<Double> npr,
        Integer n
) implements A33Input, GroupInput {
}
