package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV23;

import java.io.Serializable;

public record ParamGroupV23(
        String type,
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) implements ParamGroup, ParamV23, Serializable {
}
