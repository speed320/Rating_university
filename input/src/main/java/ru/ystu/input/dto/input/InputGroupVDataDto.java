package ru.ystu.input.dto.input;

import ru.ystu.input.dto.input.groups.digroup.DiInput;
import ru.ystu.input.dto.input.groups.pngroup.PnInput;
import ru.ystu.input.dto.input.groups.vgroups.*;

public record InputGroupVDataDto(
        V11Input v11,
        V12Input v12,
        V13Input v13,
        V14Input v14,
        V21Input v21,
        V22Input v22,
        V23Input v23,
        V24Input v24,
        V25Input v25,
        V26Input v26,
        V27Input v27,
        V31Input v31,
        V32Input v32,
        V33Input v33,
        V41Input v41,
        V42Input v42,
        V43Input v43,
        V44Input v44,
        PnInput pn,
        DiInput di
) {
}
