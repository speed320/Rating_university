package ru.ystu.input.dto.output.param.groups.vgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.dto.output.param.groups.vgroups.param.VGroupOutputV23;
import ru.ystu.input.dto.output.param.groups.vgroups.result.ResultVGroup;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = VGroupOutputV23.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultVGroup.class, name = "result")
})
public interface V23Output extends Serializable {
}
