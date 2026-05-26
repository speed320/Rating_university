package ru.ystu.input.dto.input.groups.agroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.agroups.A11Input;

public record AGroupInputA11(
        String type,
        Double prf,
        Double kco
) implements A11Input, GroupInput {
}
