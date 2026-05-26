package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A22Output;

public record AGroupOutputA22(
        String type,
        Double zkn,
        Double chpa
) implements A22Output, GroupOutput {
}
