package ru.ystu.input.dto.input.groups.agroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.dto.input.groups.agroups.param.AGroupInputA22;
import ru.ystu.input.dto.input.groups.agroups.result.ResultAGroup;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AGroupInputA22.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultAGroup.class, name = "result")
})
public interface A22Input {
}
