package ru.ystu.input.dto.input.groups.digroup;

import ru.ystu.input.dto.input.groups.ResultGroup;

public record ResultDiGroup(
        String type,
        Double resultGroup
) implements DiInput, ResultGroup {
}
