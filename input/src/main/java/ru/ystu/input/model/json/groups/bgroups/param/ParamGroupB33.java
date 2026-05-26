package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB33;

import java.io.Serializable;
import java.util.List;

public record ParamGroupB33(
        String type,
        Double cht,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt
) implements ParamGroup, ParamB33, Serializable {
}
