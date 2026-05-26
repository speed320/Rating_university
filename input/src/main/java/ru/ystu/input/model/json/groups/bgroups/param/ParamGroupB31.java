package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB31;

import java.io.Serializable;

public record ParamGroupB31(
        String type,
        Double ut,
        Double doCount
) implements ParamGroup, ParamB31, Serializable {
}
