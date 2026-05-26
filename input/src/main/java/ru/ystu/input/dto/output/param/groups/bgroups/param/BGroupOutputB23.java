package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B23Output;

public record BGroupOutputB23(
        String type,
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) implements B23Output, GroupOutput {
}
