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
public class NameGroupV implements Serializable {
    private String codeV11;
    private String codeV12;
    private String codeV13;
    private String codeV14;
    private String codeV21;
    private String codeV22;
    private String codeV23;
    private String codeV24;
    private String codeV25;
    private String codeV26;
    private String codeV27;
    private String codeV31;
    private String codeV32;
    private String codeV33;
    private String codeV41;
    private String codeV42;
    private String codeV43;
    private String codeV44;
    private String codePn;
    private String codeDi;
}
