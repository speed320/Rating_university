package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A34Input;

import java.util.List;

public record AGroupInputA34(
        String type,
        List<Double> asp,
        List<Double> ia,
        Double n
) implements A34Input, GroupInput {
}
