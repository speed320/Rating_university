package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV32;

import java.io.Serializable;

public record ParamGroupV32(
        String type,
        Double n,
        Double vo,
        Double po,
        Double npr
) implements ParamGroup, ParamV32, Serializable {
}
