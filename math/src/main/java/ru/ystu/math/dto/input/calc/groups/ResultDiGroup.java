package ru.ystu.math.dto.input.calc.groups;

public record ResultDiGroup(
        String type,
        Double resultGroup
) implements DiInput, ResultGroup {
}
