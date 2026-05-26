package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V26Output;

import java.util.List;

public record VGroupOutputV26(
        String type,
        List<Double> chps,
        List<Double> chp,
        Integer k
) implements V26Output, GroupOutput {
}
