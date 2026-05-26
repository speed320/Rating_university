package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA21;

import java.io.Serializable;

public record ParamGroupA21(
        String type,
        Double zkn,
        Double chva
) implements ParamGroup, ParamA21, Serializable {
}
