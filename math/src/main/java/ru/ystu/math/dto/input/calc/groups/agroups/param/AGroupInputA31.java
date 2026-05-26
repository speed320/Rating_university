package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A31Input;

import java.util.List;

public record AGroupInputA31(
        String type,
        List<Double> wl,
        List<Double> npr,
        Integer n
) implements A31Input, GroupInput {
}
