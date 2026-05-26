package ru.ystu.math.dto.output.calc;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ru.ystu.math.model.NameRatingClasses;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "classType")
public interface OutputClassWrapperDto{
    NameRatingClasses classType();
}
