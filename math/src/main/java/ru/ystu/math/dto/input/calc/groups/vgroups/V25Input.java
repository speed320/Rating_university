package ru.ystu.math.dto.input.calc.groups.vgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.math.dto.input.calc.groups.vgroups.param.VGroupInputV25;
import ru.ystu.math.dto.input.calc.groups.vgroups.result.ResultVGroup;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = VGroupInputV25.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultVGroup.class, name = "result")
})
public interface V25Input {
}
