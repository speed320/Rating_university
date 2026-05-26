package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB43;

import java.io.Serializable;

public record ParamGroupB43(
        String type,
        Double io,
        Double iv,
        Double iz,
        Double no,
        Double nv,
        Double nz
) implements ParamGroup, ParamB43, Serializable {
}
