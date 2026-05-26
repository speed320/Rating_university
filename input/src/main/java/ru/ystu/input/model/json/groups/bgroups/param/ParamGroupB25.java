package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB25;

import java.io.Serializable;
import java.util.List;

public record ParamGroupB25(
        String type,
        Integer k,
        List<Double> chpsi,
        List<Double>chpi
) implements ParamGroup, ParamB25, Serializable {
}
