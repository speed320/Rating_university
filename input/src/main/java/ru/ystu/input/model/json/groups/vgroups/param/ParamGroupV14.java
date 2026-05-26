package ru.ystu.input.model.json.groups.vgroups.param;


import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV14;

import java.io.Serializable;

public record ParamGroupV14(
        String type,
        Double prf,
        Double kco
) implements ParamGroup, ParamV14, Serializable {
}
