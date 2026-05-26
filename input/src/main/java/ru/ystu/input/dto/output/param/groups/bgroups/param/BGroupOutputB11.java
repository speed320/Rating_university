package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B11Output;

public record BGroupOutputB11(
        String type,
        Double ena,
        Double enb,
        Double eb,
        Double enc,
        Double ec
) implements B11Output, GroupOutput {
}
