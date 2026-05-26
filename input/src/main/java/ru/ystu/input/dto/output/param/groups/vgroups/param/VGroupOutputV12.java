package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V12Output;

public record VGroupOutputV12(
        String type,
        Double chz,
        Double zpk
) implements V12Output, GroupOutput {
}
