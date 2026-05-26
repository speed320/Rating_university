package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B31Input;

public record BGroupInputB31(
        String type,
        Double ut,
        Double doCount
) implements B31Input, GroupInput {
}
