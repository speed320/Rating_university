package ru.ystu.input.model.json.groups.pngroup;

import ru.ystu.input.model.json.groups.ResultGroup;

import java.io.Serializable;

public record ResultGroupPn(
        String type,
        Double resultGroup
) implements ParamPn, ResultGroup, Serializable {
}
