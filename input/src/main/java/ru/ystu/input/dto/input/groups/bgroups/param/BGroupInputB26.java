package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B26Input;

import java.util.List;

public record BGroupInputB26(
        String type,
        Integer k,
        List<Double> chosi,
        List<Double> choi
) implements B26Input, GroupInput {
}
