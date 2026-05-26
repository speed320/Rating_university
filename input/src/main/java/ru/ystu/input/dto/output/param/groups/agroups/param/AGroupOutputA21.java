package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A21Output;

public record AGroupOutputA21(
        String type,
        Double zkn,
        Double chva
) implements A21Output, GroupOutput {
}
