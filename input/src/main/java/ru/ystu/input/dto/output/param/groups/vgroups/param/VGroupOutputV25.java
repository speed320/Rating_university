package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V25Output;

public record VGroupOutputV25(
        String type,
        Double bp,
        Double cp,
        Double nmp
) implements V25Output, GroupOutput {
}
