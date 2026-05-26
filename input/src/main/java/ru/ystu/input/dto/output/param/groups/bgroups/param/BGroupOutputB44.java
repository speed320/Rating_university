package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B44Output;

import java.util.List;

public record BGroupOutputB44(
        String type,
        Integer n,
        List<Double> od,
        List<Double> pn
) implements B44Output, GroupOutput {
}
