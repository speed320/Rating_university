package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V21Output;

public record VGroupOutputV21(
        String type,
        Double countNpsHavingPoa,
        Double countLicenseNps
) implements V21Output, GroupOutput {
}
