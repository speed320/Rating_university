package ru.ystu.input.dto.output.param.groups.pngroup;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GroupOutputPn.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultPnGroup.class, name = "result")
})
public interface PnOutput extends Serializable {
}
