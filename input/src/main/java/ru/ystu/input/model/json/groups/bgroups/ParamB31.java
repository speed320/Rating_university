package ru.ystu.input.model.json.groups.bgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.json.groups.bgroups.param.ParamGroupB31;
import ru.ystu.input.model.json.groups.bgroups.result.ResultGroupB;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamGroupB31.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultGroupB.class, name = "result")
})
public interface ParamB31 {
}
