package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A32Input;

import java.util.List;

public record AGroupInputA32(
        String type,
        List<Double> dn,
        List<Double> npr,
        Double n
) implements A32Input, GroupInput {
}
