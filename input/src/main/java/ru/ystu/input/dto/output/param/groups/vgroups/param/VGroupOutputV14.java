package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V14Output;

public record VGroupOutputV14(
        String type,
        Double prf,
        Double kco
) implements V14Output, GroupOutput {
}
