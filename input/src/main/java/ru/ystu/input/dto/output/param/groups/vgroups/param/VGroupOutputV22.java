package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V22Output;

public record VGroupOutputV22(
        String type,
        Double acp,
        Double opc,
        Double acc,
        Double nmp
) implements V22Output, GroupOutput {
}
