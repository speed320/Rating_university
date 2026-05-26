package ru.ystu.input.dto.input.groups.agroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.dto.input.groups.agroups.param.AGroupInputA11;
import ru.ystu.input.dto.input.groups.agroups.result.ResultAGroup;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AGroupInputA11.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultAGroup.class, name = "result")
})
public interface A11Input {
}
