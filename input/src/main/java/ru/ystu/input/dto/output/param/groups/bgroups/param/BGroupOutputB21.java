package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B21Output;

public record BGroupOutputB21(
        String type,
        Double countNpsHavingPao,
        Double countLicenseNps
) implements B21Output, GroupOutput {
}
