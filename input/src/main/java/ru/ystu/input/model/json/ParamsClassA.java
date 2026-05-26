package ru.ystu.input.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ystu.input.model.json.groups.digroup.ParamDi;
import ru.ystu.input.model.json.groups.pngroup.ParamPn;
import ru.ystu.input.model.json.groups.agroups.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamsClassA implements Params {
    private ParamA11 a11;
    private ParamA21 a21;
    private ParamA22 a22;
    private ParamA23 a23;
    private ParamA31 a31;
    private ParamA32 a32;
    private ParamA33 a33;
    private ParamA34 a34;
    private ParamA35 a35;
    private ParamA36 a36;
    private ParamA37 a37;
    private ParamPn pn;
    private ParamDi di;
}
