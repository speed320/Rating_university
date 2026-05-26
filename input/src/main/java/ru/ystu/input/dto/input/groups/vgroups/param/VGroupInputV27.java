package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V27Input;

import java.util.List;

public record VGroupInputV27(
        String type,
        List<Double> chosi,
        List<Double> choi,
        Integer k
) implements V27Input, GroupInput {
}
