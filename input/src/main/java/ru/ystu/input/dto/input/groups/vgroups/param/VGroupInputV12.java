package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V12Input;

public record VGroupInputV12(
        String type,
        Double chz,
        Double zpk
) implements V12Input, GroupInput {
}
