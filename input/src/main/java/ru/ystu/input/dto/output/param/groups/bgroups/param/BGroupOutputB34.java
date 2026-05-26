package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B34Output;

import java.util.List;

public record BGroupOutputB34(
        String type,
        Integer k,
        List<Double> hp
) implements B34Output, GroupOutput {
}
