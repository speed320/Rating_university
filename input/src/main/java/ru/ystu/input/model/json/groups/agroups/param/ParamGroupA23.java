package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA23;

import java.io.Serializable;

public record ParamGroupA23(
        String type,
        Double cz,
        Double cv
) implements ParamGroup, ParamA23, Serializable {
}
