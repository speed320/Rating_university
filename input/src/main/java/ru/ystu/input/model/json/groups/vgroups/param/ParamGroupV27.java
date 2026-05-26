package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV27;

import java.io.Serializable;
import java.util.List;

public record ParamGroupV27(
        String type,
        List<Double> chosi,
        List<Double> choi,
        Integer k
) implements ParamGroup, ParamV27, Serializable {
}
