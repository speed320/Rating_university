package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V33Output;

import java.util.List;

public record VGroupOutputV33(
        String type,
        List<Double> hp,
        Integer k
) implements V33Output, GroupOutput {
}
