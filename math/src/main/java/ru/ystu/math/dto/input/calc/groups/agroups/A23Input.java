package ru.ystu.math.dto.input.calc.groups.agroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.math.dto.input.calc.groups.agroups.param.AGroupInputA23;
import ru.ystu.math.dto.input.calc.groups.agroups.result.ResultAGroup;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AGroupInputA23.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultAGroup.class, name = "result")
})
public interface A23Input {
}
