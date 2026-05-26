package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA37;

import java.io.Serializable;

public record ParamGroupA37(
        String type,
        Double ozg
) implements ParamGroup, ParamA37, Serializable {
}
