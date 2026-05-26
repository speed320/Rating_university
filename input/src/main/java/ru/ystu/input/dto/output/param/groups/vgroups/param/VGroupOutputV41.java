package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V41Output;

import java.util.List;

public record VGroupOutputV41(
        String type,
        List<Double> wl,
        List<Double> npr,
        Integer n
) implements V41Output, GroupOutput {
}
