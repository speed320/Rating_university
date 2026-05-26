package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B13Output;

public record BGroupOutputB13(
        String type,
        Double cp,
        Double p
) implements B13Output, GroupOutput {
}
