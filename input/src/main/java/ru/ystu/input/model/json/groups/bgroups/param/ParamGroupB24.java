package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB24;

import java.io.Serializable;

public record ParamGroupB24(
        String type,
        Double nap,
        Double pn
) implements ParamGroup, ParamB24, Serializable {
}
