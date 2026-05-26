package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B22Input;

public record BGroupInputB22(
        String type,
        Double nmp,
        Double acp,
        Double opc,
        Double acc,
        Double nbp
) implements B22Input, GroupInput {
}
