package ru.ystu.input.model.json.groups.bgroups.param;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.bgroups.ParamB21;

import java.io.Serializable;

public record ParamGroupB21(
        String type,
        Double countNpsHavingPao,
        Double countLicenseNps
) implements ParamGroup, ParamB21, Serializable {
}
