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
public class NameGroupA implements Serializable {
    private String codeA11;
    private String codeA21;
    private String codeA22;
    private String codeA23;
    private String codeA31;
    private String codeA32;
    private String codeA33;
    private String codeA34;
    private String codeA35;
    private String codeA36;
    private String codeA37;
    private String codePn;
    private String codeDi;
}
