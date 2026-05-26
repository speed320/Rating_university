package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B42Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

import java.util.List;

public record BGroupInputB42(
        String type,
        Integer n,
        List<Double> dn,
        List<Double> npr
) implements B42Input, GroupInput {
}
