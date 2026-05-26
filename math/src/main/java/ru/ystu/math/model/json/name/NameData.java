package ru.ystu.math.model.json.name;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NameData implements Serializable {
    private NameClasses nameClasses;
    private NameGroupA nameGroupA;
    private NameGroupB nameGroupB;
    private NameGroupV nameGroupV;
}
