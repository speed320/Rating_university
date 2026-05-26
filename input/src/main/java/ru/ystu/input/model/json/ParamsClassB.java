package ru.ystu.input.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ystu.input.model.json.groups.bgroups.*;
import ru.ystu.input.model.json.groups.digroup.ParamDi;
import ru.ystu.input.model.json.groups.pngroup.ParamPn;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamsClassB  implements Params {
    private ParamB11 b11;
    private ParamB12 b12;
    private ParamB13 b13;
    private ParamB21 b21;
    private ParamB22 b22;
    private ParamB23 b23;
    private ParamB24 b24;
    private ParamB25 b25;
    private ParamB26 b26;
    private ParamB31 b31;
    private ParamB32 b32;
    private ParamB33 b33;
    private ParamB34 b34;
    private ParamB41 b41;
    private ParamB42 b42;
    private ParamB43 b43;
    private ParamB44 b44;
    private ParamPn pn;
    private ParamDi di;
}
