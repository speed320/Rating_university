package ru.ystu.math.dto.input.calc.groups.vgroups.result;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.ResultGroup;
import ru.ystu.math.dto.input.calc.groups.vgroups.*;

public record ResultVGroup(
        String type,
        Double resultGroup
) implements GroupInput, ResultGroup, V11Input, V12Input, V13Input, V14Input,
        V21Input, V22Input, V23Input, V24Input, V25Input, V26Input, V27Input,
        V31Input, V32Input, V33Input,
        V41Input, V42Input, V43Input, V44Input {
}
