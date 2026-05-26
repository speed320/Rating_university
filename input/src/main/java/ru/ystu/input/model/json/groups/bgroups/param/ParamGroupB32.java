package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB32;

import java.io.Serializable;

public record ParamGroupB32(
        String type,
        Double n,
        Double vo,
        Double po,
        Double npr
) implements ParamGroup, ParamB32, Serializable {
}
