package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B24Output;

public record BGroupOutputB24(
        String type,
        Double nap,
        Double pn
) implements B24Output, GroupOutput {
}
