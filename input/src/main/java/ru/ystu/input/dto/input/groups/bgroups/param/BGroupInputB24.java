package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B24Input;

public record BGroupInputB24(
        String type,
        Double nap,
        Double pn
) implements B24Input, GroupInput {
}
