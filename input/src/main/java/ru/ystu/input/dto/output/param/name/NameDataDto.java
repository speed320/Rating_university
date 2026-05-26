package ru.ystu.input.dto.output.param.name;

import java.io.Serializable;

public record NameDataDto(
        NameClassesDto nameClasses,
        NameGroupADto nameGroupA,
        NameGroupBDto nameGroupB,
        NameGroupVDto nameGroupV
) implements Serializable {
}
