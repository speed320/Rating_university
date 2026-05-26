package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B41Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

import java.util.List;

public record BGroupInputB41(
        String type,
        Integer n,
        List<Double> wl,
        List<Double> npr
) implements B41Input, GroupInput {
}
