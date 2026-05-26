package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV41;

import java.io.Serializable;
import java.util.List;

public record ParamGroupV41(
        String type,
        List<Double> wl,
        List<Double> npr,
        Integer n
) implements ParamGroup, ParamV41, Serializable {
}
