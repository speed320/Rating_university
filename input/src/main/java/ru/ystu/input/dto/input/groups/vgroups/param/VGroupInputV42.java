package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V42Input;

import java.util.List;

public record VGroupInputV42(
        String type,
        List<Double> dn,
        List<Double> npr,
        Integer n
) implements V42Input, GroupInput {
}
