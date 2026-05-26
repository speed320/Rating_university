package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V25Input;

public record VGroupInputV25(
        String type,
        Double bp,
        Double cp,
        Double nmp
) implements V25Input, GroupInput {
}
