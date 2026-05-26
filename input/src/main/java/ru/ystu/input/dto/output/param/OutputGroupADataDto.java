package ru.ystu.input.dto.output.param;

import ru.ystu.input.dto.output.param.groups.agroups.*;
import ru.ystu.input.dto.output.param.groups.digroup.DiOutput;
import ru.ystu.input.dto.output.param.groups.pngroup.PnOutput;

import java.io.Serializable;

public record OutputGroupADataDto(
        A11Output a11,
        A21Output a21,
        A22Output a22,
        A23Output a23,
        A31Output a31,
        A32Output a32,
        A33Output a33,
        A34Output a34,
        A35Output a35,
        A36Output a36,
        A37Output a37,
        PnOutput pn,
        DiOutput di
) implements Serializable {
}
