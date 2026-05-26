package ru.ystu.input.dto.output.param;

import ru.ystu.input.dto.output.param.groups.bgroups.*;
import ru.ystu.input.dto.output.param.groups.digroup.DiOutput;
import ru.ystu.input.dto.output.param.groups.pngroup.PnOutput;

import java.io.Serializable;

public record OutputGroupBDataDto(
        B11Output b11,
        B12Output b12,
        B13Output b13,
        B21Output b21,
        B22Output b22,
        B23Output b23,
        B24Output b24,
        B25IOutput b25,
        B26Output b26,
        B31Output b31,
        B32Output b32,
        B33Output b33,
        B34Output b34,
        B41Output b41,
        B42Output b42,
        B43Output b43,
        B44Output b44,
        PnOutput pn,
        DiOutput di
) implements Serializable {
}
