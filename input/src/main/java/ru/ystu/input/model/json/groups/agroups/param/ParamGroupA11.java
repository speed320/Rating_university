package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA11;

import java.io.Serializable;

public record ParamGroupA11(
        String type,
        Double prf,
        Double kco
) implements ParamA11, ParamGroup, Serializable {
}
