package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V44Output;

import java.util.List;

public record VGroupOutputV44(
        String type,
        List<Double> od,
        List<Double> pn,
        Integer n
) implements V44Output, GroupOutput {
}
