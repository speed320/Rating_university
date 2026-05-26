package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV13;

import java.io.Serializable;

public record ParamGroupV13(
        String type,
        Double mdp,
        Double zpk
) implements ParamGroup, ParamV13, Serializable {
}
