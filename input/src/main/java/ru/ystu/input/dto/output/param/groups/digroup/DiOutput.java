package ru.ystu.input.dto.output.param.groups.digroup;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GroupOutputDi.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultDiGroup.class, name = "result")
})
public interface DiOutput extends Serializable {
}
