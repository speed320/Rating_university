package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V27Output;

import java.util.List;

public record VGroupOutputV27(
        String type,
        List<Double> chosi,
        List<Double> choi,
        Integer k
) implements V27Output, GroupOutput {
}
