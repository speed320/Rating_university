package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A33Input;

import java.util.List;

public record AGroupInputA33(
        String type,
        List<Double> rdn,
        List<Double> npr,
        Double n
) implements A33Input, GroupInput {
}
