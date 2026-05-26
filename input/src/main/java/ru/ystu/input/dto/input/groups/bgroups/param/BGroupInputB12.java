package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B12Input;

public record BGroupInputB12(
        String type,
        Double prf,
        Double kco
) implements B12Input, GroupInput {
}
