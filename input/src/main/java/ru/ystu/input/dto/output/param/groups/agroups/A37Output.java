package ru.ystu.input.dto.output.param.groups.agroups;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.dto.output.param.groups.agroups.param.AGroupOutputA37;
import ru.ystu.input.dto.output.param.groups.agroups.result.ResultAGroup;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AGroupOutputA37.class, name = "paramData"),
        @JsonSubTypes.Type(value = ResultAGroup.class, name = "result")
})
public interface A37Output extends Serializable {
}
