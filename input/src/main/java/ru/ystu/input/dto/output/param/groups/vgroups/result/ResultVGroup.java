package ru.ystu.input.dto.output.param.groups.vgroups.result;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.ResultGroup;
import ru.ystu.input.dto.output.param.groups.vgroups.*;

public record ResultVGroup(
        String type,
        Double resultGroup
) implements GroupOutput, ResultGroup, V11Output, V12Output, V13Output, V14Output,
        V21Output, V22Output, V23Output, V24Output, V25Output, V26Output, V27Output,
        V31Output, V32Output, V33Output,
        V41Output, V42Output, V43Output, V44Output {
}
