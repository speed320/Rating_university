package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V11Input;

public record VGroupInputV11(
        String type,
        Double zmd,
        Double zm
) implements V11Input, GroupInput {
}
