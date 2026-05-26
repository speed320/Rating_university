package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV12;

import java.io.Serializable;

public record ParamGroupV12(
        String type,
        Double chz,
        Double zpk
) implements ParamGroup, ParamV12, Serializable {
}
