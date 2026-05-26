package ru.ystu.math.dto.input.calc.groups.agroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.agroups.A36Input;

public record AGroupInputA36(
        String type,
        Double aso,
        Double pfn
) implements A36Input, GroupInput {
}
