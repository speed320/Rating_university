package ru.ystu.math.dto.input.calc;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.math.model.NameRatingClasses;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "classType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputClassAWrapperDto.class, name = "A"),
        @JsonSubTypes.Type(value = InputClassBWrapperDto.class, name = "B"),
        @JsonSubTypes.Type(value = InputClassVWrapperDto.class, name = "V")
})
public interface ClassWrapper {
    NameRatingClasses classType();
}
