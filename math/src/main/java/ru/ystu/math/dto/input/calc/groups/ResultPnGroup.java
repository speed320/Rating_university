package ru.ystu.math.dto.input.calc.groups;

public record ResultPnGroup(
        String type,
        Double resultGroup
) implements PnInput, ResultGroup{
}
