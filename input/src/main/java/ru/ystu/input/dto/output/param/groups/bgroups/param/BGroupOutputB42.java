package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B42Output;

import java.util.List;

public record BGroupOutputB42(
        String type,
        Integer n,
        List<Double> dn,
        List<Double> npr
) implements B42Output, GroupOutput {
}
