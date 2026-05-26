package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV11;

import java.io.Serializable;

public record ParamGroupV11(
        String type,
        Double zmd,
        Double zm
) implements ParamGroup, ParamV11, Serializable {
}
