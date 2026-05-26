package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B43Input;

public record BGroupInputB43(
        String type,
        Double io,
        Double iv,
        Double iz,
        Double no,
        Double nv,
        Double nz
) implements B43Input, GroupInput {
}
