package ru.ystu.input.dto.input.groups.digroup;

import ru.ystu.input.dto.input.groups.GroupInput;

public record GroupInputDi(
        String type,
        Double dio,
        Double div,
        Double diz
) implements DiInput, GroupInput {
}
