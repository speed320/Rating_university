package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A31Output;

import java.util.List;

public record AGroupOutputA31(
        String type,
        List<Double> wl,
        List<Double> npr,
        Double n
) implements A31Output, GroupOutput {
}
