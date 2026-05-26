package ru.ystu.input.dto.output.param.groups.bgroups.result;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.ResultGroup;
import ru.ystu.input.dto.output.param.groups.bgroups.*;

public record ResultBGroup(
        String type,
        Double resultGroup
) implements GroupOutput, ResultGroup, B11Output, B12Output, B13Output,
        B21Output, B22Output, B23Output, B24Output, B25IOutput, B26Output,
        B31Output, B32Output, B33Output, B34Output,
        B41Output, B42Output, B43Output, B44Output {
}
