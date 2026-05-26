package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A23Output;

public record AGroupOutputA23(
        String type,
        Double cz,
        Double cv
) implements A23Output, GroupOutput {
}
