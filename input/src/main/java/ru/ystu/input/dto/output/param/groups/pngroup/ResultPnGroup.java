package ru.ystu.input.dto.output.param.groups.pngroup;

import ru.ystu.input.dto.output.param.groups.ResultGroup;

public record ResultPnGroup(
        String type,
        Double resultGroup
) implements PnOutput, ResultGroup {
}
