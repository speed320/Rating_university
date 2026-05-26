package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA31;

import java.io.Serializable;
import java.util.List;

public record ParamGroupA31(
        String type,
        List<Double> wl,
        List<Double> npr,
        Double n
) implements ParamGroup, ParamA31, Serializable {
}
