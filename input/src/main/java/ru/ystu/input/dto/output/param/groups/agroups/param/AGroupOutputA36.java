package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A36Output;

public record AGroupOutputA36(
        String type,
        Double aso,
        Double pfn
) implements A36Output, GroupOutput {
}
