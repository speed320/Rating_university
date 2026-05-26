package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V11Output;

public record VGroupOutputV11(
        String type,
        Double zmd,
        Double zm
) implements V11Output, GroupOutput {
}
