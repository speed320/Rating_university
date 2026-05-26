package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V42Input;

import java.util.List;

public record VGroupInputV42(
        String type,
        List<Double> dn,
        List<Double> npr,
        Integer n
) implements V42Input, GroupInput {
}
