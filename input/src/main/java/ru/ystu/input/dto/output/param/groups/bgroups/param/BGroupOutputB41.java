package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B41Output;

import java.util.List;

public record BGroupOutputB41(
        String type,
        Integer n,
        List<Double> wl,
        List<Double> npr
) implements B41Output, GroupOutput {
}
