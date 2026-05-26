package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA35;

import java.io.Serializable;
import java.util.List;

public record ParamGroupA35(
        String type,
        List<Double> od,
        List<Double> npr,
        Double n
) implements ParamGroup, ParamA35, Serializable {
}
