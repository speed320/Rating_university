package ru.ystu.input.dto.output.param;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.NameRatingClasses;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "classType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OutputClassAWrapperDto.class, name = "A"),
        @JsonSubTypes.Type(value = OutputClassBWrapperDto.class, name = "B"),
        @JsonSubTypes.Type(value = OutputClassVWrapperDto.class, name = "V")
})
public interface ClassWrapper extends Serializable {
    NameRatingClasses classType();
}
