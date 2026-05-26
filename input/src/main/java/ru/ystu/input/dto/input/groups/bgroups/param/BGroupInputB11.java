package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B11Input;

public record BGroupInputB11(
        String type,
        Double ena,
        Double enb,
        Double eb,
        Double enc,
        Double ec
) implements B11Input, GroupInput {
}
