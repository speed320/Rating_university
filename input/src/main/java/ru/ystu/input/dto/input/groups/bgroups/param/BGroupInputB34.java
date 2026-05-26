package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B34Input;

import java.util.List;

public record BGroupInputB34(
        String type,
        Integer k,
        List<Double> hp
) implements B34Input, GroupInput {
}
