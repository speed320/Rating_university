package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA34;

import java.io.Serializable;
import java.util.List;

public record ParamGroupA34(
        String type,
        List<Double> asp,
        List<Double> ia,
        Double n
) implements ParamGroup, ParamA34, Serializable {
}
