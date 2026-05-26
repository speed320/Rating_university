package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V26Input;

import java.util.List;

public record VGroupInputV26(
        String type,
        List<Double> chps,
        List<Double> chp,
        Integer k
) implements V26Input, GroupInput {
}
