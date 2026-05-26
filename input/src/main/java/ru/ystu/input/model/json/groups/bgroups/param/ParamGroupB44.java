package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB44;

import java.io.Serializable;
import java.util.List;

public record ParamGroupB44(
        String type,
        Integer n,
        List<Double> od,
        List<Double> pn
) implements ParamGroup, ParamB44, Serializable {
}
