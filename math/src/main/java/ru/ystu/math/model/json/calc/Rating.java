package ru.ystu.math.model.json.calc;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RatingClassA.class, name = "A"),
        @JsonSubTypes.Type(value = RatingClassB.class, name = "B"),
        @JsonSubTypes.Type(value = RatingClassV.class, name = "V")
})
public interface Rating extends Serializable {
    Double getAssessment();
}
