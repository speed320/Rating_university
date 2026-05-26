package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B13Input;

public record BGroupInputB13(
        String type,
        Double cp,
        Double p
) implements B13Input, GroupInput {
}
