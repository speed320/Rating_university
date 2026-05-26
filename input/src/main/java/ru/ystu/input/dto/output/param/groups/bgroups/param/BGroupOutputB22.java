package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B22Output;

public record BGroupOutputB22(
        String type,
        Double nmp,
        Double acp,
        Double opc,
        Double acc,
        Double nbp
) implements B22Output, GroupOutput {
}
