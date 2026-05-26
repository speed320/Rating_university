package ru.ystu.input.model.json.groups.pngroup;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupPn.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupPn.class, name = "result")
})
public interface ParamPn {
}
