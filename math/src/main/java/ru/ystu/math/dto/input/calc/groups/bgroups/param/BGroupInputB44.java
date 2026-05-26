package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B44Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

import java.util.List;

public record BGroupInputB44(
        String type,
        Integer n,
        List<Double> od,
        List<Double> pn
) implements B44Input, GroupInput {
}
