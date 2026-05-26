package ru.ystu.input.model.json.groups.bgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.json.groups.bgroups.param.ParamGroupB33;
import ru.ystu.input.model.json.groups.bgroups.result.ResultGroupB;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupB33.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupB.class, name = "result")
})
public interface ParamB33 {
}
