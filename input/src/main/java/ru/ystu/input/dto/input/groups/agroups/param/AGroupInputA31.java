package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A31Input;

import java.util.List;

public record AGroupInputA31(
        String type,
        List<Double> wl,
        List<Double> npr,
        Double n
) implements A31Input, GroupInput {
}
