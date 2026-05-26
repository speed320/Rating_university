package ru.ystu.input.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ystu.input.model.json.groups.digroup.ParamDi;
import ru.ystu.input.model.json.groups.pngroup.ParamPn;
import ru.ystu.input.model.json.groups.vgroups.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamsClassV implements Params{
    private ParamV11 v11;
    private ParamV12 v12;
    private ParamV13 v13;
    private ParamV14 v14;
    private ParamV21 v21;
    private ParamV22 v22;
    private ParamV23 v23;
    private ParamV24 v24;
    private ParamV25 v25;
    private ParamV26 v26;
    private ParamV27 v27;
    private ParamV31 v31;
    private ParamV32 v32;
    private ParamV33 v33;
    private ParamV41 v41;
    private ParamV42 v42;
    private ParamV43 v43;
    private ParamV44 v44;
    private ParamPn pn;
    private ParamDi di;
}
