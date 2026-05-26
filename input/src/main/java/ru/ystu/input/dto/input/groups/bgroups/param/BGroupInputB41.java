package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B41Input;

import java.util.List;

public record BGroupInputB41(
        String type,
        Integer n,
        List<Double> wl,
        List<Double> npr
) implements B41Input, GroupInput {
}
