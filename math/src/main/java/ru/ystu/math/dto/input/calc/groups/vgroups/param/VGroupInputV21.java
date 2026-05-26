package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V21Input;

public record VGroupInputV21(
        String type,
        Double countNpsHavingPoa,
        Double countLicenseNps
) implements V21Input, GroupInput {
}
