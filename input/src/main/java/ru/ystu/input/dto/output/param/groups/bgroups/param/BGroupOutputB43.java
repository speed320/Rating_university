package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B43Output;

public record BGroupOutputB43(
        String type,
        Double io,
        Double iv,
        Double iz,
        Double no,
        Double nv,
        Double nz
) implements B43Output, GroupOutput {
}
