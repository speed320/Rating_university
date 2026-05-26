package ru.ystu.input.dto.output.param;

import ru.ystu.input.dto.output.param.name.NameDataDto;

import java.io.Serializable;
import java.util.List;

public record OutputPayloadDto(
        NameDataDto names,
        List<ClassWrapper> classes
) implements Serializable {
}
