package ru.ystu.input.dto.input.groups.bgroups.result;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.ResultGroup;
import ru.ystu.input.dto.input.groups.bgroups.*;

public record ResultBGroup(
        String type,
        Double resultGroup
) implements GroupInput, ResultGroup, B11Input, B12Input, B13Input,
        B21Input, B22Input, B23Input, B24Input, B25Input, B26Input,
        B31Input, B32Input, B33Input, B34Input,
        B41Input, B42Input, B43Input, B44Input {
}
