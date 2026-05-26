package ru.ystu.math.dto.input.calc.groups.bgroups.result;

import ru.ystu.math.dto.input.calc.groups.DiInput;
import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.PnInput;
import ru.ystu.math.dto.input.calc.groups.ResultGroup;
import ru.ystu.math.dto.input.calc.groups.bgroups.*;

public record ResultBGroup(
        String type,
        Double resultGroup
) implements GroupInput, ResultGroup, B11Input, B12Input, B13Input,
        B21Input, B22Input, B23Input, B24Input, B25Input, B26Input,
        B31Input, B32Input, B33Input, B34Input,
        B41Input, B42Input, B43Input, B44Input {
}
