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
public class NameGroupB implements Serializable {
    private String codeB11;
    private String codeB12;
    private String codeB13;
    private String codeB21;
    private String codeB22;
    private String codeB23;
    private String codeB24;
    private String codeB25;
    private String codeB26;
    private String codeB31;
    private String codeB32;
    private String codeB33;
    private String codeB34;
    private String codeB41;
    private String codeB42;
    private String codeB43;
    private String codeB44;
    private String codePn;
    private String codeDi;
}
