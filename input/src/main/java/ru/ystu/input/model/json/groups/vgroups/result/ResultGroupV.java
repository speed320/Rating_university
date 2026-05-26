package ru.ystu.input.model.json.groups.vgroups.result;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.ResultGroup;
import ru.ystu.input.model.json.groups.vgroups.*;

import java.io.Serializable;

public record ResultGroupV(
        String type,
        Double resultGroup
) implements ParamGroup, ParamV11, ParamV12, ParamV13, ParamV14,
        ParamV21, ParamV22, ParamV23, ParamV24, ParamV25, ParamV26, ParamV27,
        ParamV31, ParamV32, ParamV33,
        ParamV41, ParamV42, ParamV43, ParamV44,
        ResultGroup, Serializable {
}
