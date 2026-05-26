package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V44Input;

import java.util.List;

public record VGroupInputV44(
        String type,
        List<Double> od,
        List<Double> pn,
        Integer n
) implements V44Input, GroupInput {
}
