package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V26Input;

import java.util.List;

public record VGroupInputV26(
        String type,
        List<Double> chps,
        List<Double> chp,
        Integer k
) implements V26Input, GroupInput {
}
