package ru.ystu.math.dto.input.calc.groups.bgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.math.dto.input.calc.groups.bgroups.param.BGroupInputB24;
import ru.ystu.math.dto.input.calc.groups.bgroups.result.ResultBGroup;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BGroupInputB24.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultBGroup.class, name = "result")
})
public interface B24Input {
}
