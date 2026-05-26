package ru.ystu.input.dto.output.param.groups.bgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.dto.output.param.groups.bgroups.param.BGroupOutputB21;
import ru.ystu.input.dto.output.param.groups.bgroups.result.ResultBGroup;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BGroupOutputB21.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultBGroup.class, name = "result")
})
public interface B21Output extends Serializable {
}
