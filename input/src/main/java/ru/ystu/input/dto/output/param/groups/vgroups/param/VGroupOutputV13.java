package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V13Output;

public record VGroupOutputV13(
        String type,
        Double mdp,
        Double zpk
) implements V13Output, GroupOutput {
}
