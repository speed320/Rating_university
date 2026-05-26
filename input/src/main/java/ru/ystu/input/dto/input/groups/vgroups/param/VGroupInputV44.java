package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V44Input;

import java.util.List;

public record VGroupInputV44(
        String type,
        List<Double> od,
        List<Double> pn,
        Integer n
) implements V44Input, GroupInput {
}
