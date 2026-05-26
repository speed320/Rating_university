package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB23;

import java.io.Serializable;

public record ParamGroupB23(
        String type,
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) implements ParamGroup, ParamB23, Serializable {
}
