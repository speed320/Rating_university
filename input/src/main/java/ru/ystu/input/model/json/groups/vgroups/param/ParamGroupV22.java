package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV22;

import java.io.Serializable;

public record ParamGroupV22(
        String type,
        Double acp,
        Double opc,
        Double acc,
        Double nmp
) implements ParamGroup, ParamV22, Serializable {
}
