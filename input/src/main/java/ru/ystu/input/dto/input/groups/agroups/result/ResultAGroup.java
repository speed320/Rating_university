package ru.ystu.input.dto.input.groups.agroups.result;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.ResultGroup;
import ru.ystu.input.dto.input.groups.agroups.*;

public record ResultAGroup(
        String type,
        Double resultGroup
) implements GroupInput, ResultGroup, A11Input,
        A21Input, A22Input, A23Input,
        A31Input, A32Input, A33Input, A34Input, A35Input, A36Input, A37Input {
}
