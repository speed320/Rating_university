package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B23Input;

public record BGroupInputB23(
        String type,
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) implements B23Input, GroupInput {
}
