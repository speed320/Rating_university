package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B21Input;

public record BGroupInputB21(
        String type,
        Double countNpsHavingPao,
        Double countLicenseNps
) implements B21Input, GroupInput {
}
