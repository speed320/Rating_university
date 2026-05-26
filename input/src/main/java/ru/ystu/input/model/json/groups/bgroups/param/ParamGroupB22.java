package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB22;

import java.io.Serializable;

public record ParamGroupB22(
        String type,
        Double nmp,
        Double acp,
        Double opc,
        Double acc,
        Double nbp
) implements ParamGroup, ParamB22, Serializable {
}
