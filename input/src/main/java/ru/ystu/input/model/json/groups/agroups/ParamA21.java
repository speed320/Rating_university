package ru.ystu.input.model.json.groups.agroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.json.groups.agroups.param.ParamGroupA21;
import ru.ystu.input.model.json.groups.agroups.result.ResultGroupA;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupA21.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupA.class, name = "result")
})
public interface ParamA21 {
}
