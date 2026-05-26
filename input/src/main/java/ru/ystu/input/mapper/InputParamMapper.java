package ru.ystu.input.mapper;

import org.springframework.stereotype.Component;
import ru.ystu.input.dto.input.*;
import ru.ystu.input.dto.input.groups.agroups.*;
import ru.ystu.input.dto.input.groups.agroups.param.*;
import ru.ystu.input.dto.input.groups.agroups.result.ResultAGroup;
import ru.ystu.input.dto.input.groups.bgroups.*;
import ru.ystu.input.dto.input.groups.bgroups.param.*;
import ru.ystu.input.dto.input.groups.bgroups.result.ResultBGroup;
import ru.ystu.input.dto.input.groups.digroup.DiInput;
import ru.ystu.input.dto.input.groups.digroup.GroupInputDi;
import ru.ystu.input.dto.input.groups.digroup.ResultDiGroup;
import ru.ystu.input.dto.input.groups.pngroup.GroupInputPn;
import ru.ystu.input.dto.input.groups.pngroup.PnInput;
import ru.ystu.input.dto.input.groups.pngroup.ResultPnGroup;
import ru.ystu.input.dto.input.groups.vgroups.*;
import ru.ystu.input.dto.input.groups.vgroups.param.*;
import ru.ystu.input.dto.input.groups.vgroups.result.ResultVGroup;
import ru.ystu.input.model.NameRatingClasses;
import ru.ystu.input.model.UserEnteredParameters;
import ru.ystu.input.model.json.Params;
import ru.ystu.input.model.json.ParamsClassA;
import ru.ystu.input.model.json.ParamsClassB;
import ru.ystu.input.model.json.ParamsClassV;
import ru.ystu.input.model.json.groups.agroups.*;
import ru.ystu.input.model.json.groups.agroups.param.*;
import ru.ystu.input.model.json.groups.agroups.result.ResultGroupA;
import ru.ystu.input.model.json.groups.bgroups.*;
import ru.ystu.input.model.json.groups.bgroups.param.*;
import ru.ystu.input.model.json.groups.bgroups.result.ResultGroupB;
import ru.ystu.input.model.json.groups.digroup.ParamDi;
import ru.ystu.input.model.json.groups.digroup.ParamGroupDi;
import ru.ystu.input.model.json.groups.digroup.ResultGroupDi;
import ru.ystu.input.model.json.groups.pngroup.ParamGroupPn;
import ru.ystu.input.model.json.groups.pngroup.ParamPn;
import ru.ystu.input.model.json.groups.pngroup.ResultGroupPn;
import ru.ystu.input.model.json.groups.vgroups.*;
import ru.ystu.input.model.json.groups.vgroups.param.*;
import ru.ystu.input.model.json.groups.vgroups.result.ResultGroupV;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class InputParamMapper {

    public InputParamMapper() {
    }

    public List<UserEnteredParameters> toEntities(InputParamDto dto, UUID batchId, Long userId) {
        if (dto == null || dto.payload() == null) {
            return List.of();
        }

        List<UserEnteredParameters> entities = new ArrayList<>();
        Instant now = Instant.now();

        for (ClassWrapper wrapper : dto.payload().classes()) {
            if (wrapper instanceof InputClassAWrapperDto classA) {
                entities.addAll(mapClassA(classA, batchId, userId, now));
            } else if (wrapper instanceof InputClassBWrapperDto classB) {
                entities.addAll(mapClassB(classB, batchId, userId, now));
            } else if (wrapper instanceof InputClassVWrapperDto classV) {
                entities.addAll(mapClassV(classV, batchId, userId, now));
            }
        }

        return entities;
    }

    private List<UserEnteredParameters> mapClassA(InputClassAWrapperDto classA, UUID batchId, Long userId, Instant now) {
        return classA.data().stream().map(yearData ->
                createEntity(NameRatingClasses.A.name(),
                        yearData.ratingYear(),
                        convertDtoToParamsA(yearData.groupData()),
                        batchId,
                        userId,
                        now)).toList();
    }

    private UserEnteredParameters createEntity(String paramClass, Integer year, Params params, UUID batchId, Long userId, Instant now) {
        UserEnteredParameters entity = new UserEnteredParameters();
        entity.setParamClass(paramClass);
        entity.setParamYear(year);
        entity.setParams(params);
        entity.setBatchId(batchId);
        entity.setUserId(userId);
        entity.setCreatedAt(now);

        return entity;
    }

    private ParamsClassA convertDtoToParamsA(InputGroupADataDto dto) {
        if (dto == null) {
            return null;
        }
        return ParamsClassA.builder()
                .a11(convertA11(dto.a11()))
                .a21(convertA21(dto.a21()))
                .a22(convertA22(dto.a22()))
                .a23(convertA23(dto.a23()))
                .a31(convertA31(dto.a31()))
                .a32(convertA32(dto.a32()))
                .a33(convertA33(dto.a33()))
                .a34(convertA34(dto.a34()))
                .a35(convertA35(dto.a35()))
                .a36(convertA36(dto.a36()))
                .a37(convertA37(dto.a37()))
                .pn(convertPn(dto.pn()))
                .di(convertDi(dto.di()))
                .build();
    }

    private ParamA11 convertA11(A11Input dto) {
        if (dto instanceof AGroupInputA11 param) {
            return new ParamGroupA11(param.type(), param.prf(), param.kco());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA21 convertA21(A21Input dto) {
        if (dto instanceof AGroupInputA21 param) {
            return new ParamGroupA21(param.type(), param.zkn(), param.chva());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA22 convertA22(A22Input dto) {
        if (dto instanceof AGroupInputA22 param) {
            return new ParamGroupA22(param.type(), param.zkn(), param.chpa());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA23 convertA23(A23Input dto) {
        if (dto instanceof AGroupInputA23 param) {
            return new ParamGroupA23(param.type(), param.cz(), param.cv());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA31 convertA31(A31Input dto) {
        if (dto instanceof AGroupInputA31 param) {
            return new ParamGroupA31(param.type(), param.wl(), param.npr(), param.n());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA32 convertA32(A32Input dto) {
        if (dto instanceof AGroupInputA32 param) {
            return new ParamGroupA32(param.type(), param.dn(), param.npr(), param.n());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA33 convertA33(A33Input dto) {
        if (dto instanceof AGroupInputA33 param) {
            return new ParamGroupA33(param.type(), param.rdn(), param.npr(), param.n());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA34 convertA34(A34Input dto) {
        if (dto instanceof AGroupInputA34 param) {
            return new ParamGroupA34(param.type(), param.asp(), param.ia(), param.n());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA35 convertA35(A35Input dto) {
        if (dto instanceof AGroupInputA35 param) {
            return new ParamGroupA35(param.type(), param.od(), param.npr(), param.n());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA36 convertA36(A36Input dto) {
        if (dto instanceof AGroupInputA36 param) {
            return new ParamGroupA36(param.type(), param.aso(), param.pfn());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamA37 convertA37(A37Input dto) {
        if (dto instanceof AGroupInputA37 param) {
            return new ParamGroupA37(param.type(), param.ozg());
        } else if (dto instanceof ResultAGroup result) {
            return new ResultGroupA(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamPn convertPn(PnInput dto) {
        if (dto instanceof GroupInputPn param) {
            return new ParamGroupPn(param.type(), param.pno(), param.pnv(), param.pnz());
        } else if (dto instanceof ResultPnGroup result) {
            return new ResultGroupPn(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamDi convertDi(DiInput dto) {
        if (dto instanceof GroupInputDi param) {
            return new ParamGroupDi(param.type(), param.dio(), param.div(), param.diz());
        } else if (dto instanceof ResultDiGroup result) {
            return new ResultGroupDi(result.type(), result.resultGroup());
        }
        return null;
    }

    private List<UserEnteredParameters> mapClassB(InputClassBWrapperDto classB, UUID batchId, Long userId, Instant now) {
        return classB.data().stream().map(yearData ->
                createEntity(NameRatingClasses.B.name(),
                        yearData.ratingYear(),
                        convertDtoToParamsB(yearData.groupData()),
                        batchId,
                        userId,
                        now)).toList();
    }

    private ParamsClassB convertDtoToParamsB(InputGroupBDataDto dto) {
        if (dto == null) {
            return null;
        }
        return ParamsClassB.builder()
                .b11(convertB11(dto.b11()))
                .b12(convertB12(dto.b12()))
                .b13(convertB13(dto.b13()))
                .b21(convertB21(dto.b21()))
                .b22(convertB22(dto.b22()))
                .b23(convertB23(dto.b23()))
                .b24(convertB24(dto.b24()))
                .b25(convertB25(dto.b25()))
                .b26(convertB26(dto.b26()))
                .b31(convertB31(dto.b31()))
                .b32(convertB32(dto.b32()))
                .b33(convertB33(dto.b33()))
                .b34(convertB34(dto.b34()))
                .b41(convertB41(dto.b41()))
                .b42(convertB42(dto.b42()))
                .b43(convertB43(dto.b43()))
                .b44(convertB44(dto.b44()))
                .pn(convertPn(dto.pn()))
                .di(convertDi(dto.di()))
                .build();
    }

    private ParamB11 convertB11(B11Input dto) {
        if (dto instanceof BGroupInputB11 param) {
            return new ParamGroupB11(param.type(), param.ena(), param.enb(), param.eb(), param.enc(), param.ec());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB12 convertB12(B12Input dto) {
        if (dto instanceof BGroupInputB12 param) {
            return new ParamGroupB12(param.type(), param.prf(), param.kco());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB13 convertB13(B13Input dto) {
        if (dto instanceof BGroupInputB13 param) {
            return new ParamGroupB13(param.type(), param.cp(), param.p());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }


    private ParamB21 convertB21(B21Input dto) {
        if (dto instanceof BGroupInputB21 param) {
            return new ParamGroupB21(param.type(), param.countNpsHavingPao(), param.countLicenseNps());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB22 convertB22(B22Input dto) {
        if (dto instanceof BGroupInputB22 param) {
            return new ParamGroupB22(param.type(), param.nmp(), param.acp(), param.opc(), param.acc(), param.nbp());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB23 convertB23(B23Input dto) {
        if (dto instanceof BGroupInputB23 param) {
            return new ParamGroupB23(param.type(), param.pkp(), param.ppp(), param.np(), param.noa());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB24 convertB24(B24Input dto) {
        if (dto instanceof BGroupInputB24 param) {
            return new ParamGroupB24(param.type(), param.nap(), param.pn());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB25 convertB25(B25Input dto) {
        if (dto instanceof BGroupInputB25 param) {
            return new ParamGroupB25(param.type(), param.k(), param.chpsi(), param.chpi());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB26 convertB26(B26Input dto) {
        if (dto instanceof BGroupInputB26 param) {
            return new ParamGroupB26(param.type(), param.k(), param.chosi(), param.choi());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB31 convertB31(B31Input dto) {
        if (dto instanceof BGroupInputB31 param) {
            return new ParamGroupB31(param.type(), param.ut(), param.doCount());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB32 convertB32(B32Input dto) {
        if (dto instanceof BGroupInputB32 param) {
            return new ParamGroupB32(param.type(), param.n(), param.vo(), param.po(), param.npr());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB33 convertB33(B33Input dto) {
        if (dto instanceof BGroupInputB33 param) {
            return new ParamGroupB33(param.type(), param.cht(), param.dv(), param.ft(), param.pmt());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB34 convertB34(B34Input dto) {
        if (dto instanceof BGroupInputB34 param) {
            return new ParamGroupB34(param.type(), param.k(), param.hp());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB41 convertB41(B41Input dto) {
        if (dto instanceof BGroupInputB41 param) {
            return new ParamGroupB41(param.type(), param.n(), param.wl(), param.npr());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB42 convertB42(B42Input dto) {
        if (dto instanceof BGroupInputB42 param) {
            return new ParamGroupB42(param.type(), param.n(), param.dn(), param.npr());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB43 convertB43(B43Input dto) {
        if (dto instanceof BGroupInputB43 param) {
            return new ParamGroupB43(param.type(), param.io(), param.iv(), param.iz(), param.no(), param.nv(), param.nz());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamB44 convertB44(B44Input dto) {
        if (dto instanceof BGroupInputB44 param) {
            return new ParamGroupB44(param.type(), param.n(), param.od(), param.pn());
        } else if (dto instanceof ResultBGroup result) {
            return new ResultGroupB(result.type(), result.resultGroup());
        }
        return null;
    }

    private List<UserEnteredParameters> mapClassV(InputClassVWrapperDto classV, UUID batchId, Long userId, Instant now) {
        return classV.data().stream().map(yearData ->
                createEntity(NameRatingClasses.V.name(),
                        yearData.ratingYear(),
                        convertDtoToParamsV(yearData.groupData()),
                        batchId,
                        userId,
                        now)).toList();
    }

    private ParamsClassV convertDtoToParamsV(InputGroupVDataDto dto) {
        if (dto == null) return null;
        return ParamsClassV.builder()
                .v11(convertV11(dto.v11()))
                .v12(convertV12(dto.v12()))
                .v13(convertV13(dto.v13()))
                .v14(convertV14(dto.v14()))
                .v21(convertV21(dto.v21()))
                .v22(convertV22(dto.v22()))
                .v23(convertV23(dto.v23()))
                .v24(convertV24(dto.v24()))
                .v25(convertV25(dto.v25()))
                .v26(convertV26(dto.v26()))
                .v27(convertV27(dto.v27()))
                .v31(convertV31(dto.v31()))
                .v32(convertV32(dto.v32()))
                .v33(convertV33(dto.v33()))
                .v41(convertV41(dto.v41()))
                .v42(convertV42(dto.v42()))
                .v43(convertV43(dto.v43()))
                .v44(convertV44(dto.v44()))
                .pn(convertPn(dto.pn()))
                .di(convertDi(dto.di())).build();
    }

    private ParamV11 convertV11(V11Input dto) {
        if (dto instanceof VGroupInputV11 param) {
            return new ParamGroupV11(param.type(), param.zmd(), param.zm());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV12 convertV12(V12Input dto) {
        if (dto instanceof VGroupInputV12 param) {
            return new ParamGroupV12(param.type(), param.chz(), param.zpk());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV13 convertV13(V13Input dto) {
        if (dto instanceof VGroupInputV13 param) {
            return new ParamGroupV13(param.type(), param.mdp(), param.zpk());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV14 convertV14(V14Input dto) {
        if (dto instanceof VGroupInputV14 param) {
            return new ParamGroupV14(param.type(), param.prf(), param.kco());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV21 convertV21(V21Input dto) {
        if (dto instanceof VGroupInputV21 param) {
            return new ParamGroupV21(param.type(), param.countNpsHavingPoa(), param.countLicenseNps());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV22 convertV22(V22Input dto) {
        if (dto instanceof VGroupInputV22 param) {
            return new ParamGroupV22(param.type(), param.acp(), param.opc(), param.acc(), param.nmp());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV23 convertV23(V23Input dto) {
        if (dto instanceof VGroupInputV23 param) {
            return new ParamGroupV23(param.type(), param.pkp(), param.ppp(), param.np(), param.noa());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV24 convertV24(V24Input dto) {
        if (dto instanceof VGroupInputV24 param) {
            return new ParamGroupV24(param.type(), param.nap(), param.pn());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV25 convertV25(V25Input dto) {
        if (dto instanceof VGroupInputV25 param) {
            return new ParamGroupV25(param.type(), param.bp(), param.cp(), param.nmp());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV26 convertV26(V26Input dto) {
        if (dto instanceof VGroupInputV26 param) {
            return new ParamGroupV26(param.type(), param.chps(), param.chp(), param.k());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV27 convertV27(V27Input dto) {
        if (dto instanceof VGroupInputV27 param) {
            return new ParamGroupV27(param.type(), param.chosi(), param.choi(), param.k());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV31 convertV31(V31Input dto) {
        if (dto instanceof VGroupInputV31 param) {
            return new ParamGroupV31(param.type(), param.dv(), param.ft(), param.pmt(), param.cht());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV32 convertV32(V32Input dto) {
        if (dto instanceof VGroupInputV32 param) {
            return new ParamGroupV32(param.type(), param.n(), param.vo(), param.po(), param.npr());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV33 convertV33(V33Input dto) {
        if (dto instanceof VGroupInputV33 param) {
            return new ParamGroupV33(param.type(), param.hp(), param.k());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV41 convertV41(V41Input dto) {
        if (dto instanceof VGroupInputV41 param) {
            return new ParamGroupV41(param.type(), param.wl(), param.npr(), param.n());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV42 convertV42(V42Input dto) {
        if (dto instanceof VGroupInputV42 param) {
            return new ParamGroupV42(param.type(), param.dn(), param.npr(), param.n());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV43 convertV43(V43Input dto) {
        if (dto instanceof VGroupInputV43 param) {
            return new ParamGroupV43(param.type(), param.io(), param.iv(), param.iz(), param.no(), param.nv(), param.nz());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

    private ParamV44 convertV44(V44Input dto) {
        if (dto instanceof VGroupInputV44 param) {
            return new ParamGroupV44(param.type(), param.od(), param.pn(), param.n());
        } else if (dto instanceof ResultVGroup result) {
            return new ResultGroupV(result.type(), result.resultGroup());
        }
        return null;
    }

}
