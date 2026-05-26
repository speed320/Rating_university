package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A11Output;

public record AGroupOutputA11(
        String type,
        Double prf,
        Double kco
) implements A11Output, GroupOutput {
}
