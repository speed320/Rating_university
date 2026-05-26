package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V24Output;

public record VGroupOutputV24(
        String type,
        Double nap,
        Double pn
) implements V24Output, GroupOutput {
}
