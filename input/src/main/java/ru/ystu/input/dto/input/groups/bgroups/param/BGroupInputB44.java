package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B44Input;

import java.util.List;

public record BGroupInputB44(
        String type,
        Integer n,
        List<Double> od,
        List<Double> pn
) implements B44Input, GroupInput {
}
