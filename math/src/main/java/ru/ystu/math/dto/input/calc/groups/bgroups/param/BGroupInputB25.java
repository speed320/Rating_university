package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B25Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

import java.util.List;

public record BGroupInputB25(
        String type,
        Integer k,
        List<Double> chpsi,
        List<Double>chpi
) implements B25Input, GroupInput {
}
