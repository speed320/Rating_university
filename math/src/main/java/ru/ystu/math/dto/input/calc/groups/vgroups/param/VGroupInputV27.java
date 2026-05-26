package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V27Input;

import java.util.List;

public record VGroupInputV27(
        String type,
        List<Double> chosi,
        List<Double> choi,
        Integer k
) implements V27Input, GroupInput {
}
