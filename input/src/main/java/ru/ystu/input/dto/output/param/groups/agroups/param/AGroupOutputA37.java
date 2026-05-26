package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A37Output;

public record AGroupOutputA37(
        String type,
        Double ozg
) implements A37Output, GroupOutput {
}
