package ru.ystu.input.model.json.groups.agroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.json.groups.agroups.param.ParamGroupA37;
import ru.ystu.input.model.json.groups.agroups.result.ResultGroupA;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupA37.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupA.class, name = "result")
})
public interface ParamA37 {
}
