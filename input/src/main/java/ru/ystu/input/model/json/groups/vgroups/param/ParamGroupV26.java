package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV26;

import java.io.Serializable;
import java.util.List;

public record ParamGroupV26(
        String type,
        List<Double> chps,
        List<Double> chp,
        Integer k
) implements ParamGroup, ParamV26, Serializable {
}
