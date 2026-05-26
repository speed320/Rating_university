package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B21Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

public record BGroupInputB21(
        String type,
        Double countNpsHavingPao,
        Double countLicenseNps
) implements B21Input, GroupInput {
}
