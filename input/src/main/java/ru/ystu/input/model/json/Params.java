package ru.ystu.input.model.json;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParamsClassA.class, name = "A"),
        @JsonSubTypes.Type(value = ParamsClassB.class, name = "B"),
        @JsonSubTypes.Type(value = ParamsClassV.class, name = "V")
})
public interface Params extends Serializable {
}
