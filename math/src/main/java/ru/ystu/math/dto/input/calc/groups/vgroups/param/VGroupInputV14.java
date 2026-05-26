package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V14Input;

public record VGroupInputV14(
        String type,
        Double prf,
        Double kco
) implements V14Input, GroupInput {
}
