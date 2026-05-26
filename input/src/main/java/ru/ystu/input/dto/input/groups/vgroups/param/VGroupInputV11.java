package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V11Input;

public record VGroupInputV11(
        String type,
        Double zmd,
        Double zm
) implements V11Input, GroupInput {
}
