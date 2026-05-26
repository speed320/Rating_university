package ru.ystu.math.dto.input.calc.groups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GroupInputDi.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultDiGroup.class, name = "result")
})
public interface DiInput {
}
