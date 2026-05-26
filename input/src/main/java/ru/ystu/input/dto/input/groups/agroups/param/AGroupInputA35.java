package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A35Input;

import java.util.List;

public record AGroupInputA35(
        String type,
        List<Double> od,
        List<Double> npr,
        Double n
) implements A35Input, GroupInput {
}
