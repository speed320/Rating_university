package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA22;

import java.io.Serializable;

public record ParamGroupA22(
        String type,
        Double zkn,
        Double chpa
) implements ParamGroup, ParamA22, Serializable {
}
