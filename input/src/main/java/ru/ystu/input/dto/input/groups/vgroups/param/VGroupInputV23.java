package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V23Input;

public record VGroupInputV23(
        String type,
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) implements V23Input, GroupInput {
}
