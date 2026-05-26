package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V32Output;

public record VGroupOutputV32(
        String type,
        Double n,
        Double vo,
        Double po,
        Double npr
) implements V32Output, GroupOutput {
}
