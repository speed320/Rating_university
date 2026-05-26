package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV31;

import java.io.Serializable;
import java.util.List;

public record ParamGroupV31(
        String type,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt,
        Double cht
) implements ParamGroup, ParamV31, Serializable {
}
