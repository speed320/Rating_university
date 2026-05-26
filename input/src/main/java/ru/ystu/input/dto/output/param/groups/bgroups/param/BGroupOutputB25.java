package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B25IOutput;

import java.util.List;

public record BGroupOutputB25(
        String type,
        Integer k,
        List<Double> chpsi,
        List<Double>chpi
) implements B25IOutput, GroupOutput {
}
