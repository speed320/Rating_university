package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV33;

import java.io.Serializable;
import java.util.List;

public record ParamGroupV33(
        String type,
        List<Double> hp,
        Integer k
) implements ParamGroup, ParamV33, Serializable {
}
