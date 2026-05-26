package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V14Input;

public record VGroupInputV14(
        String type,
        Double prf,
        Double kco
) implements V14Input, GroupInput {
}
