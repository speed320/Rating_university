package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V43Output;

public record VGroupOutputV43(
        String type,
        Double io,
        Double iv,
        Double iz,
        Double no,
        Double nv,
        Double nz
) implements V43Output, GroupOutput {
}
