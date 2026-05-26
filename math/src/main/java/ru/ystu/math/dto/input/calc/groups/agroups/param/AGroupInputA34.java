package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A34Input;

import java.util.List;

public record AGroupInputA34(
        String type,
        List<Double> asp,
        List<Double> ia,
        Double n
) implements A34Input, GroupInput {
}
