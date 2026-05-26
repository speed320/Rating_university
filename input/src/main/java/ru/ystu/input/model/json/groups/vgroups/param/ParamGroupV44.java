package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV44;

import java.io.Serializable;
import java.util.List;

public record ParamGroupV44(
        String type,
        List<Double> od,
        List<Double> pn,
        Integer n
) implements ParamGroup, ParamV44, Serializable {
}
