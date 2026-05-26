package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V33Input;

import java.util.List;

public record VGroupInputV33(
        String type,
        List<Double> hp,
        Integer k
) implements V33Input, GroupInput {
}
