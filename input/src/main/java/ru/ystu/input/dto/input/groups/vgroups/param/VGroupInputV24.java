package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V24Input;

public record VGroupInputV24(
        String type,
        Double nap,
        Double pn
) implements V24Input, GroupInput {
}
