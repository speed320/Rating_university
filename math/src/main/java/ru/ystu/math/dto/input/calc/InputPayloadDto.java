package ru.ystu.math.dto.input.calc;

import ru.ystu.math.dto.name.NameDataDto;

import java.util.List;

public record InputPayloadDto(
        NameDataDto names,
        List<ClassWrapper> classes
){
}
