package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB42;

import java.io.Serializable;
import java.util.List;

public record ParamGroupB42(
        String type,
        Integer n,
        List<Double> dn,
        List<Double> npr
) implements ParamGroup, ParamB42, Serializable {
}
