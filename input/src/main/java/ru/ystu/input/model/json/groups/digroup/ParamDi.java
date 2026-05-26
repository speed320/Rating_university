package ru.ystu.input.model.json.groups.digroup;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupDi.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupDi.class, name = "result")
})
public interface ParamDi {
}
