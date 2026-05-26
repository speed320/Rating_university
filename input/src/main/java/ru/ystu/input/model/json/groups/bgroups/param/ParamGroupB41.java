package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB41;

import java.io.Serializable;
import java.util.List;

public record ParamGroupB41(
        String type,
        Integer n,
        List<Double> wl,
        List<Double> npr
) implements ParamGroup, ParamB41, Serializable {
}
