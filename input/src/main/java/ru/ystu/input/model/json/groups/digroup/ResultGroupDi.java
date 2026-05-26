package ru.ystu.input.model.json.groups.digroup;

import ru.ystu.input.model.json.groups.ResultGroup;

import java.io.Serializable;

public record ResultGroupDi(
        String type,
        Double resultGroup
) implements ParamDi, ResultGroup, Serializable {
}
