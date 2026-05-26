package ru.ystu.math.dto.input.calc.groups;

public record GroupInputPn(
        String type,
        Double pno,
        Double pnv,
        Double pnz
) implements PnInput, GroupInput {
}
