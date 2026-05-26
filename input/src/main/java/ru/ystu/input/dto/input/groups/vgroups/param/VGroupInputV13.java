package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V13Input;

public record VGroupInputV13(
        String type,
        Double mdp,
        Double zpk
) implements V13Input, GroupInput {
}
