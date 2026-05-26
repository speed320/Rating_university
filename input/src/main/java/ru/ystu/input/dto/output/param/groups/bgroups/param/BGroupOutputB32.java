package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B32Output;

public record BGroupOutputB32(
        String type,
        Double n,
        Double vo,
        Double po,
        Double npr
) implements B32Output, GroupOutput {
}
