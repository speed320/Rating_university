package ru.ystu.input.model.json.groups.bgroups.result;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.ResultGroup;
import ru.ystu.input.model.json.groups.bgroups.*;

import java.io.Serializable;

public record ResultGroupB(
        String type,
        Double resultGroup
) implements ParamGroup, ResultGroup,
        ParamB11, ParamB12, ParamB13,
        ParamB21, ParamB22, ParamB23, ParamB24, ParamB25, ParamB26,
        ParamB31, ParamB32, ParamB33, ParamB34,
        ParamB41, ParamB42, ParamB43, ParamB44, Serializable {
}
