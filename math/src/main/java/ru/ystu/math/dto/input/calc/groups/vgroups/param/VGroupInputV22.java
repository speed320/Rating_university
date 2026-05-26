package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V22Input;

public record VGroupInputV22(
        String type,
        Double acp,
        Double opc,
        Double acc,
        Double nmp
) implements V22Input, GroupInput {
}
