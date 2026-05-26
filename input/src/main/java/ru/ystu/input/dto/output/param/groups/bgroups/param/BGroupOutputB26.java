package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B26Output;

import java.util.List;

public record BGroupOutputB26(
        String type,
        Integer k,
        List<Double> chosi,
        List<Double> choi
) implements B26Output, GroupOutput {
}
