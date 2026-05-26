package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A32Output;

import java.util.List;

public record AGroupOutputA32(
        String type,
        List<Double> dn,
        List<Double> npr,
        Double n
) implements A32Output, GroupOutput {
}
