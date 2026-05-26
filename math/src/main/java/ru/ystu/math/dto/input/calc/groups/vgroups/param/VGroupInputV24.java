package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V24Input;

public record VGroupInputV24(
        String type,
        Double nap,
        Double pn
) implements V24Input, GroupInput {
}
