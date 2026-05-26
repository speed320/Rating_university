package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B25Input;

import java.util.List;

public record BGroupInputB25(
        String type,
        Integer k,
        List<Double> chpsi,
        List<Double>chpi
) implements B25Input, GroupInput {
}
