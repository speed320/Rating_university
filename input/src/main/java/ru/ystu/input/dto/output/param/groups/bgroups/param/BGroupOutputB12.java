package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B12Output;

public record BGroupOutputB12(
        String type,
        Double prf,
        Double kco
) implements B12Output, GroupOutput {
}
