package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V13Input;

public record VGroupInputV13(
        String type,
        Double mdp,
        Double zpk
) implements V13Input, GroupInput {
}
