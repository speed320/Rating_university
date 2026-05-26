package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB34;

import java.io.Serializable;
import java.util.List;

public record ParamGroupB34(
        String type,
        Integer k,
        List<Double> hp
) implements ParamGroup, ParamB34, Serializable {
}
