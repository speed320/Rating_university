package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A22Input;

public record AGroupInputA22(
        String type,
        Double zkn,
        Double chpa
) implements A22Input, GroupInput {
}
