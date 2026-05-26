package ru.ystu.input.model.json.groups.agroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.json.groups.agroups.param.ParamGroupA34;
import ru.ystu.input.model.json.groups.agroups.result.ResultGroupA;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupA34.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupA.class, name = "result")
})
public interface ParamA34 {
}
