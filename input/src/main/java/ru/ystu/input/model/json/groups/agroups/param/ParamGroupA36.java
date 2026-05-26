package ru.ystu.input.model.json.groups.agroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.agroups.ParamA36;

import java.io.Serializable;

public record ParamGroupA36(
        String type,
        Double aso,
        Double pfn
) implements ParamGroup, ParamA36, Serializable {
}
