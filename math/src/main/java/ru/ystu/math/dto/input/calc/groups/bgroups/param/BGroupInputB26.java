package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B26Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

import java.util.List;

public record BGroupInputB26(
        String type,
        Integer k,
        List<Double> chosi,
        List<Double> choi
) implements B26Input, GroupInput {
}
