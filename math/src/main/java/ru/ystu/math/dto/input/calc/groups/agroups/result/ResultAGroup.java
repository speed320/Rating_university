package ru.ystu.math.dto.input.calc.groups.agroups.result;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.ResultGroup;
import ru.ystu.math.dto.input.calc.groups.agroups.*;

public record ResultAGroup(
        String type,
        Double resultGroup
) implements GroupInput, ResultGroup, A11Input,
        A21Input, A22Input, A23Input,
        A31Input, A32Input, A33Input, A34Input, A35Input, A36Input, A37Input {
}
