package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A23Input;

public record AGroupInputA23(
        String type,
        Double cz,
        Double cv
) implements A23Input, GroupInput {
}
