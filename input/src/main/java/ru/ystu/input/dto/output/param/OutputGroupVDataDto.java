package ru.ystu.input.dto.output.param;

import ru.ystu.input.dto.output.param.groups.digroup.DiOutput;
import ru.ystu.input.dto.output.param.groups.pngroup.PnOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.*;

import java.io.Serializable;

public record OutputGroupVDataDto(
        V11Output v11,
        V12Output v12,
        V13Output v13,
        V14Output v14,
        V21Output v21,
        V22Output v22,
        V23Output v23,
        V24Output v24,
        V25Output v25,
        V26Output v26,
        V27Output v27,
        V31Output v31,
        V32Output v32,
        V33Output v33,
        V41Output v41,
        V42Output v42,
        V43Output v43,
        V44Output v44,
        PnOutput pn,
        DiOutput di
) implements Serializable {
}
