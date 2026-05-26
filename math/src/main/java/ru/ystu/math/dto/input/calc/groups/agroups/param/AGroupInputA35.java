package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A35Input;

import java.util.List;

public record AGroupInputA35(
        String type,
        List<Double> od,
        List<Double> npr,
        Double n
) implements A35Input, GroupInput {
}
