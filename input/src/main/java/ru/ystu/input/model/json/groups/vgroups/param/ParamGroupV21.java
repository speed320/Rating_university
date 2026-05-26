package ru.ystu.input.model.json.groups.vgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.vgroups.ParamV21;

import java.io.Serializable;

public record ParamGroupV21(
        String type,
        Double countNpsHavingPoa,
        Double countLicenseNps
) implements ParamGroup, ParamV21, Serializable {
}
