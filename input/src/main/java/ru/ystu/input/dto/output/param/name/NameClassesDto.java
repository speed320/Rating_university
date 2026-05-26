package ru.ystu.input.dto.output.param.name;

import java.io.Serializable;

public record NameClassesDto(
        String A,
        String B,
        String V
) implements Serializable {
}
