package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB11;

import java.io.Serializable;

public record ParamGroupB11(
        String type,
        Double ena,
        Double enb,
        Double eb,
        Double enc,
        Double ec
) implements ParamGroup, ParamB11, Serializable {
}
