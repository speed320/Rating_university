package ru.ystu.math.dto.input.calc.groups;

public record GroupInputDi(
        String type,
        Double dio,
        Double div,
        Double diz
) implements DiInput, GroupInput {
}
