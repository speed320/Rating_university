package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A34Output;

import java.util.List;

public record AGroupOutputA34(
        String type,
        List<Double> asp,
        List<Double> ia,
        Double n
) implements A34Output, GroupOutput {
}
