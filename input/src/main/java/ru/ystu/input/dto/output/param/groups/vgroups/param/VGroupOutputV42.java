package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V42Output;

import java.util.List;

public record VGroupOutputV42(
        String type,
        List<Double> dn,
        List<Double> npr,
        Integer n
) implements V42Output, GroupOutput {
}
