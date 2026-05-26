package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B31Output;

public record BGroupOutputB31(
        String type,
        Double ut,
        Double doCount
) implements B31Output, GroupOutput {
}
