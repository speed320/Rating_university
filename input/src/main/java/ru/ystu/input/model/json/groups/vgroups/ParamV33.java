package ru.ystu.input.model.json.groups.vgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.json.groups.vgroups.param.ParamGroupV33;
import ru.ystu.input.model.json.groups.vgroups.result.ResultGroupV;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupV33.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupV.class, name = "result")
})
public interface ParamV33 {
}
