package ru.ystu.input.dto.output.param.groups.agroups.result;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.ResultGroup;
import ru.ystu.input.dto.output.param.groups.agroups.*;

public record ResultAGroup(
        String type,
        Double resultGroup
) implements GroupOutput, ResultGroup, A11Output,
        A21Output, A22Output, A23Output,
        A31Output, A32Output, A33Output, A34Output, A35Output, A36Output, A37Output {
}
