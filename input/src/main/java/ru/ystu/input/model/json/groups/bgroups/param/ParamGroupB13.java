package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB13;

import java.io.Serializable;

public record ParamGroupB13(
        String type,
        Double cp,
        Double p
) implements ParamGroup, ParamB13, Serializable {
}
