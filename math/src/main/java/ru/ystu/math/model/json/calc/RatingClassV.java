package ru.ystu.math.model.json.calc;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RatingClassV implements Rating {
    private Double V11;
    private Double V12;
    private Double V13;
    private Double V14;
    private Double V21;
    private Double V22;
    private Double V23;
    private Double V24;
    private Double V25;
    private Double V26;
    private Double V27;
    private Double V31;
    private Double V32;
    private Double V33;
    private Double V41;
    private Double V42;
    private Double V43;
    private Double V44;
    private Double PN;
    private Double DI;
    private Double KI;
    private Double assessment;
}
