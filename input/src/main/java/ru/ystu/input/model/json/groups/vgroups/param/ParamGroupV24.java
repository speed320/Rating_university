package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV24;

import java.io.Serializable;

public record ParamGroupV24(
        String type,
        Double nap,
        Double pn
) implements ParamGroup, ParamV24, Serializable {
}
