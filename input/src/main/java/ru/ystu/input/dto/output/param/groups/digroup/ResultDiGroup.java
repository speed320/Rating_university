package ru.ystu.input.dto.output.param.groups.digroup;

import ru.ystu.input.dto.output.param.groups.ResultGroup;

public record ResultDiGroup(
        String type,
        Double resultGroup
) implements DiOutput, ResultGroup {
}
