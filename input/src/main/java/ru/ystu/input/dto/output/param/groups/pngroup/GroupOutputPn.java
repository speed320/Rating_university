package ru.ystu.input.dto.output.param.groups.pngroup;

import ru.ystu.input.dto.output.param.groups.GroupOutput;

public record GroupOutputPn(
        String type,
        Double pno,
        Double pnv,
        Double pnz
) implements PnOutput, GroupOutput {
}
