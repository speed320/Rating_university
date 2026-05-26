package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V33Input;

import java.util.List;

public record VGroupInputV33(
        String type,
        List<Double> hp,
        Integer k
) implements V33Input, GroupInput {
}
