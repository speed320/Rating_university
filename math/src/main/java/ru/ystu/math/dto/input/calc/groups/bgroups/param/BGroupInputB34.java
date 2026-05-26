package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B34Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

import java.util.List;

public record BGroupInputB34(
        String type,
        Integer k,
        List<Double> hp
) implements B34Input, GroupInput {
}
