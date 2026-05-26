package ru.ystu.input.dto.input.groups.pngroup;

import ru.ystu.input.dto.input.groups.ResultGroup;

public record ResultPnGroup(
        String type,
        Double resultGroup
) implements PnInput, ResultGroup {
}
