package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA33;

import java.io.Serializable;
import java.util.List;

public record ParamGroupA33(
        String type,
        List<Double> rdn,
        List<Double> npr,
        Double n
) implements ParamGroup, ParamA33, Serializable {
}
