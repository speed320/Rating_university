package ru.ystu.math.dto.input.calc.groups.vgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.math.dto.input.calc.groups.vgroups.param.VGroupInputV44;
import ru.ystu.math.dto.input.calc.groups.vgroups.result.ResultVGroup;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = VGroupInputV44.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultVGroup.class, name = "result")
})
public interface V44Input {
}
