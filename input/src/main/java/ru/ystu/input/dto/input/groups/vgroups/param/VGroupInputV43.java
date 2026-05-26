package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V43Input;

public record VGroupInputV43(
        String type,
        Double io,
        Double iv,
        Double iz,
        Double no,
        Double nv,
        Double nz
) implements V43Input, GroupInput {
}
