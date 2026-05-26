package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A33Output;

import java.util.List;

public record AGroupOutputA33(
        String type,
        List<Double> rdn,
        List<Double> npr,
        Double n
) implements A33Output, GroupOutput {
}
