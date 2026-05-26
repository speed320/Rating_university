package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV25;

import java.io.Serializable;

public record ParamGroupV25(
        String type,
        Double bp,
        Double cp,
        Double nmp
) implements ParamGroup, ParamV25, Serializable {
}
