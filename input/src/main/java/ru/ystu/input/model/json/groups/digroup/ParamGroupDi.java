package ru.ystu.input.model.json.groups.digroup;

import ru.ystu.input.model.json.groups.ParamGroup;

import java.io.Serializable;

public record ParamGroupDi(
        String type,
        Double dio,
        Double div,
        Double diz
) implements ParamDi, ParamGroup, Serializable {
}
