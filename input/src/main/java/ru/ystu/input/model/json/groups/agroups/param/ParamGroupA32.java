package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA32;

import java.io.Serializable;
import java.util.List;

public record ParamGroupA32(
        String type,
        List<Double> dn,
        List<Double> npr,
        Double n
) implements ParamGroup, ParamA32, Serializable {
}
