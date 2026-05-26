package ru.ystu.input.dto.input.groups.pngroup;

import ru.ystu.input.dto.input.groups.GroupInput;

public record GroupInputPn(
        String type,
        Double pno,
        Double pnv,
        Double pnz
) implements PnInput, GroupInput {
}
