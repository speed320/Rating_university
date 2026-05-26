package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A37Input;

public record AGroupInputA37(
        String type,
        Double ozg
) implements A37Input, GroupInput {
}
