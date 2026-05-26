package ru.ystu.input.dto.input.groups.bgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.dto.input.groups.bgroups.param.BGroupInputB12;
import ru.ystu.input.dto.input.groups.bgroups.result.ResultBGroup;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BGroupInputB12.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultBGroup.class, name = "result")
})
public interface B12Input {
}
