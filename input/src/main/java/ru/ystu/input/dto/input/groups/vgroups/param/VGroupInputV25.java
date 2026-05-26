package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V25Input;

public record VGroupInputV25(
        String type,
        Double bp,
        Double cp,
        Double nmp
) implements V25Input, GroupInput {
}
