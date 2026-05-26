package ru.ystu.input.model.json.groups.agroups.result;

import ru.ystu.input.model.json.groups.ParamGroup;
import ru.ystu.input.model.json.groups.ResultGroup;
import ru.ystu.input.model.json.groups.agroups.*;

import java.io.Serializable;

public record ResultGroupA(
        String type,
        Double resultGroup
) implements ParamGroup, ResultGroup, ParamA11,
        ParamA21, ParamA22, ParamA23,
        ParamA31, ParamA32, ParamA33, ParamA34, ParamA35, ParamA36, ParamA37, Serializable {
}
