package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V23Input;

public record VGroupInputV23(
        String type,
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) implements V23Input, GroupInput {
}
