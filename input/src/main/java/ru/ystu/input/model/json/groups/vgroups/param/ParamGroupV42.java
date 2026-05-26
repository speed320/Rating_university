package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV42;

import java.io.Serializable;
import java.util.List;

public record ParamGroupV42(
        String type,
        List<Double> dn,
        List<Double> npr,
        Integer n
) implements ParamGroup, ParamV42, Serializable {
}
