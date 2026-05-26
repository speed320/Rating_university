package ru.ystu.input.dto.input;

import ru.ystu.input.dto.input.name.NameDataDto;

import java.util.List;

public record InputPayloadDto(
        NameDataDto names,
        List<ClassWrapper> classes
){
}
