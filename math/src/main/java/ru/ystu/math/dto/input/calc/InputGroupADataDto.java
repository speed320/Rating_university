package ru.ystu.math.dto.input.calc;

import ru.ystu.math.dto.input.calc.groups.DiInput;
import ru.ystu.math.dto.input.calc.groups.PnInput;
import ru.ystu.math.dto.input.calc.groups.agroups.*;

public record InputGroupADataDto(
        A11Input a11,
        A21Input a21,
        A22Input a22,
        A23Input a23,
        A31Input a31,
        A32Input a32,
        A33Input a33,
        A34Input a34,
        A35Input a35,
        A36Input a36,
        A37Input a37,
        PnInput pn,
        DiInput di
) {
}
