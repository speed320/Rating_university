package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A36Input;

public record AGroupInputA36(
        String type,
        Double aso,
        Double pfn
) implements A36Input, GroupInput {
}
