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
public class RatingClassB implements Rating {
    private Double B11;
    private Double B12;
    private Double B13;
    private Double B21;
    private Double B22;
    private Double B23;
    private Double B24;
    private Double B25;
    private Double B26;
    private Double B31;
    private Double B32;
    private Double B33;
    private Double B34;
    private Double B41;
    private Double B42;
    private Double B43;
    private Double B44;
    private Double PN;
    private Double DI;
    private Double KI;
    private Double assessment;
}
