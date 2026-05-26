package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V41Input;

import java.util.List;

public record VGroupInputV41(
        String type,
        List<Double> wl,
        List<Double> npr,
        Integer n
) implements V41Input, GroupInput {
}
