package ru.ystu.input.dto.input;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.input.model.NameRatingClasses;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "classType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputClassAWrapperDto.class, name = "A"),
        @JsonSubTypes.Type(value = InputClassBWrapperDto.class, name = "B"),
        @JsonSubTypes.Type(value = InputClassVWrapperDto.class, name = "V")
})
public interface ClassWrapper {
    NameRatingClasses classType();
}
