package ru.ystu.input.dto.output.param.groups.digroup;

import ru.ystu.input.dto.output.param.groups.GroupOutput;

public record GroupOutputDi(
        String type,
        Double dio,
        Double div,
        Double diz
) implements DiOutput, GroupOutput {
}
