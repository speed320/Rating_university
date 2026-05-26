package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V23Output;

public record VGroupOutputV23(
        String type,
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) implements V23Output, GroupOutput {
}
