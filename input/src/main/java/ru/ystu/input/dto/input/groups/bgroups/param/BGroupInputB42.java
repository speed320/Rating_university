package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B42Input;

import java.util.List;

public record BGroupInputB42(
        String type,
        Integer n,
        List<Double> dn,
        List<Double> npr
) implements B42Input, GroupInput {
}
