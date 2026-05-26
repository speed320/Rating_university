package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB12;

import java.io.Serializable;

public record ParamGroupB12(
        String type,
        Double prf,
        Double kco
) implements ParamGroup, ParamB12, Serializable {
}
