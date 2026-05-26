package ru.ystu.input.dto.input;

import ru.ystu.input.dto.input.groups.bgroups.*;
import ru.ystu.input.dto.input.groups.digroup.DiInput;
import ru.ystu.input.dto.input.groups.pngroup.PnInput;

public record InputGroupBDataDto(
        B11Input b11,
        B12Input b12,
        B13Input b13,
        B21Input b21,
        B22Input b22,
        B23Input b23,
        B24Input b24,
        B25Input b25,
        B26Input b26,
        B31Input b31,
        B32Input b32,
        B33Input b33,
        B34Input b34,
        B41Input b41,
        B42Input b42,
        B43Input b43,
        B44Input b44,
        PnInput pn,
        DiInput di
) {
}
