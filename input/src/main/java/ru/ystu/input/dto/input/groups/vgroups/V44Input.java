package ru.ystu.input.dto.input.groups.vgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.dto.input.groups.vgroups.param.VGroupInputV44;
import ru.ystu.input.dto.input.groups.vgroups.result.ResultVGroup;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = VGroupInputV44.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultVGroup.class, name = "result")
})
public interface V44Input {
}
