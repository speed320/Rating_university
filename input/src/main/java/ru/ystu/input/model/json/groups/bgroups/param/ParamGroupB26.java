package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB26;

import java.io.Serializable;
import java.util.List;

public record ParamGroupB26(
        String type,
        Integer k,
        List<Double> chosi,
        List<Double> choi
) implements ParamGroup, ParamB26, Serializable {
}
