package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V21Input;

public record VGroupInputV21(
        String type,
        Double countNpsHavingPoa,
        Double countLicenseNps
) implements V21Input, GroupInput {
}
