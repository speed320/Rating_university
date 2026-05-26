package ru.ystu.math.dto.input.calc.groups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GroupInputPn.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultPnGroup.class, name = "result")
})
public interface PnInput {
}
