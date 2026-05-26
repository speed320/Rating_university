package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V22Input;

public record VGroupInputV22(
        String type,
        Double acp,
        Double opc,
        Double acc,
        Double nmp
) implements V22Input, GroupInput {
}
