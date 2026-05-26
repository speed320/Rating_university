package ru.ystu.input.model.json.groups.vgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.json.groups.vgroups.param.ParamGroupV44;
import ru.ystu.input.model.json.groups.vgroups.result.ResultGroupV;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupV44.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupV.class, name = "result")
})
public interface ParamV44 {
}
