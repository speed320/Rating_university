package ru.ystu.input.dto.output.param.groups.bgroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.dto.output.param.groups.bgroups.param.BGroupOutputB34;
import ru.ystu.input.dto.output.param.groups.bgroups.result.ResultBGroup;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BGroupOutputB34.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultBGroup.class, name = "result")
})
public interface B34Output extends Serializable {
}
