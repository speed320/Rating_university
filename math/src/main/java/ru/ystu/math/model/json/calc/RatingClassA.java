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
public class RatingClassA implements Rating {
    private Double A11;
    private Double A21;
    private Double A22;
    private Double A23;
    private Double A31;
    private Double A32;
    private Double A33;
    private Double A34;
    private Double A35;
    private Double A36;
    private Double A37;
    private Double PN;
    private Double DI;
    private Double KI;
    private Double assessment;
}
