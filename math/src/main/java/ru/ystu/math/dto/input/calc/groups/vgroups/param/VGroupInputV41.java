package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V41Input;

import java.util.List;

public record VGroupInputV41(
        String type,
        List<Double> wl,
        List<Double> npr,
        Integer n
) implements V41Input, GroupInput {
}
