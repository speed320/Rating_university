package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A21Input;

public record AGroupInputA21(
        String type,
        Double zkn,
        Double chva
) implements A21Input, GroupInput {
}
