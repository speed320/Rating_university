package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V12Input;

public record VGroupInputV12(
        String type,
        Double chz,
        Double zpk
) implements V12Input, GroupInput {
}
