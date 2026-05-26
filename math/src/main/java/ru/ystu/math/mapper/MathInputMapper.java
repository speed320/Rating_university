package ru.ystu.math.mapper;

import org.springframework.stereotype.Component;
import ru.ystu.math.core.model.input.*;
import ru.ystu.math.core.model.input.groups.MathRatingGroupDi;
import ru.ystu.math.core.model.input.groups.MathRatingGroupPn;
import ru.ystu.math.core.model.input.groups.agroups.*;
import ru.ystu.math.core.model.input.groups.bgroups.*;
import ru.ystu.math.core.model.input.groups.vgroups.*;
import ru.ystu.math.dto.input.calc.*;
import ru.ystu.math.dto.input.calc.groups.*;
import ru.ystu.math.dto.input.calc.groups.agroups.*;
import ru.ystu.math.dto.input.calc.groups.agroups.param.*;
import ru.ystu.math.dto.input.calc.groups.agroups.result.ResultAGroup;
import ru.ystu.math.dto.input.calc.groups.bgroups.*;
import ru.ystu.math.dto.input.calc.groups.bgroups.param.*;
import ru.ystu.math.dto.input.calc.groups.bgroups.result.ResultBGroup;
import ru.ystu.math.dto.input.calc.groups.vgroups.*;
import ru.ystu.math.dto.input.calc.groups.vgroups.param.*;
import ru.ystu.math.dto.input.calc.groups.vgroups.result.ResultVGroup;

import java.util.List;
import java.util.stream.Collectors;

@Component
public final class MathInputMapper {

    public MathInputRating toMathCoreModel(InputPayloadDto inputRating){
        MathInputRatingClassA classA = null;
        MathInputRatingClassB classB = null;
        MathInputRatingClassV classV= null;

        for(ClassWrapper wrapper : inputRating.classes()){
            if(wrapper instanceof InputClassAWrapperDto aWrapper) {
                classA = mapClassA(aWrapper);
            }
            if(wrapper instanceof InputClassBWrapperDto bWrapper) {
                classB = mapClassB(bWrapper);
            }
            if (wrapper instanceof InputClassVWrapperDto vWrapper){
                classV = mapClassV(vWrapper);
            }
        }

        return new MathInputRating(classA, classB, classV);
    }

    private MathInputRatingClassA mapClassA(InputClassAWrapperDto classAWrapper){
        if(classAWrapper == null || classAWrapper.data() == null){
            return null;
        }

        List<MathInputClassAYearData> yearlyData = classAWrapper.data().stream().
                map(this::mapYearAData).collect(Collectors.toList());

        return new MathInputRatingClassA(yearlyData);
    }

    private MathInputClassAYearData mapYearAData(InputClassADataDto classAData){
        return new MathInputClassAYearData(
                classAData.ratingYear(),
                mapGroupAData(classAData.groupData())
        );
    }

    private MathInputGroupDataA mapGroupAData(InputGroupADataDto groupData){
        if(groupData == null){
            return null;
        }
        return new MathInputGroupDataA(
                mapA11(groupData.a11()),
                mapA21(groupData.a21()),
                mapA22(groupData.a22()),
                mapA23(groupData.a23()),
                mapA31(groupData.a31()),
                mapA32(groupData.a32()),
                mapA33(groupData.a33()),
                mapA34(groupData.a34()),
                mapA35(groupData.a35()),
                mapA36(groupData.a36()),
                mapA37(groupData.a37()),
                mapPn(groupData.pn()),
                mapDi(groupData.di())
        );
    }

    private GroupData<MathRatingGroupA11> mapA11(A11Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA11 paramData){
            MathRatingGroupA11 mathParams = new MathRatingGroupA11(
                    paramData.prf(),
                    paramData.kco()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA21> mapA21(A21Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA21 paramData){
            MathRatingGroupA21 mathParams = new MathRatingGroupA21(
                    paramData.zkn(),
                    paramData.chva()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA22> mapA22(A22Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA22 paramData){
            MathRatingGroupA22 mathParams = new MathRatingGroupA22(
                    paramData.zkn(),
                    paramData.chpa()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA23> mapA23(A23Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA23 paramData){
            MathRatingGroupA23 mathParams = new MathRatingGroupA23(
                    paramData.cz(),
                    paramData.cv()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA31> mapA31(A31Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA31 paramData){
            MathRatingGroupA31 mathParams = new MathRatingGroupA31(
                    paramData.wl(),
                    paramData.npr(),
                    paramData.n()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA32> mapA32(A32Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA32 paramData){
            MathRatingGroupA32 mathParams = new MathRatingGroupA32(
                    paramData.dn(),
                    paramData.npr(),
                    paramData.n()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA33> mapA33(A33Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA33 paramData){
            MathRatingGroupA33 mathParams = new MathRatingGroupA33(
                    paramData.rdn(),
                    paramData.npr(),
                    paramData.n()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA34> mapA34(A34Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA34 paramData){
            MathRatingGroupA34 mathParams = new MathRatingGroupA34(
                    paramData.asp(),
                    paramData.ia(),
                    paramData.n()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA35> mapA35(A35Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA35 paramData){
            MathRatingGroupA35 mathParams = new MathRatingGroupA35(
                    paramData.od(),
                    paramData.npr(),
                    paramData.n()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA36> mapA36(A36Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA36 paramData){
            MathRatingGroupA36 mathParams = new MathRatingGroupA36(
                    paramData.aso(),
                    paramData.pfn()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupA37> mapA37(A37Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultAGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof AGroupInputA37 paramData){
            MathRatingGroupA37 mathParams = new MathRatingGroupA37(
                    paramData.ozg()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private MathInputRatingClassB mapClassB(InputClassBWrapperDto classBWrapper){
        if(classBWrapper == null || classBWrapper.data() == null){
            return null;
        }

        List<MathInputClassBYearData> yearlyData = classBWrapper.data().stream().
                map(this::mapYearBData).collect(Collectors.toList());

        return new MathInputRatingClassB(yearlyData);
    }

    private MathInputClassBYearData mapYearBData(InputClassBDataDto classBData){
        return new MathInputClassBYearData(
                classBData.ratingYear(),
                mapGroupBData(classBData.groupData())
        );
    }

    private MathInputGroupDataB mapGroupBData(InputGroupBDataDto groupData){
        if(groupData == null){
            return null;
        }
        return new MathInputGroupDataB(
                mapB11(groupData.b11()),
                mapB12(groupData.b12()),
                mapB13(groupData.b13()),
                mapB21(groupData.b21()),
                mapB22(groupData.b22()),
                mapB23(groupData.b23()),
                mapB24(groupData.b24()),
                mapB25(groupData.b25()),
                mapB26(groupData.b26()),
                mapB31(groupData.b31()),
                mapB32(groupData.b32()),
                mapB33(groupData.b33()),
                mapB34(groupData.b34()),
                mapB41(groupData.b41()),
                mapB42(groupData.b42()),
                mapB43(groupData.b43()),
                mapB44(groupData.b44()),
                mapPn(groupData.pn()),
                mapDi(groupData.di())
        );
    }

    private GroupData<MathRatingGroupB11> mapB11(B11Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB11 paramData){
            MathRatingGroupB11 mathParams = new MathRatingGroupB11(
                    paramData.ena(),
                    paramData.enb(),
                    paramData.eb(),
                    paramData.enc(),
                    paramData.ec()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupB12> mapB12(B12Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB12 paramData){
            MathRatingGroupB12 mathParams = new MathRatingGroupB12(
                    paramData.prf(),
                    paramData.kco()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupB13> mapB13(B13Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB13 paramData){
            MathRatingGroupB13 mathParams = new MathRatingGroupB13(
                    paramData.cp(),
                    paramData.p()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB21> mapB21(B21Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB21 paramData){
            MathRatingGroupB21 mathParams = new MathRatingGroupB21(
                    paramData.countNpsHavingPao(),
                    paramData.countLicenseNps()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB22> mapB22(B22Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB22 paramData){
            MathRatingGroupB22 mathParams = new MathRatingGroupB22(
                    paramData.nmp(),
                    paramData.acp(),
                    paramData.opc(),
                    paramData.acc(),
                    paramData.nbp()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB23> mapB23(B23Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB23 paramData){
            MathRatingGroupB23 mathParams = new MathRatingGroupB23(
                    paramData.pkp(),
                    paramData.ppp(),
                    paramData.np(),
                    paramData.noa()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB24> mapB24(B24Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB24 paramData){
            MathRatingGroupB24 mathParams = new MathRatingGroupB24(
                    paramData.nap(),
                    paramData.pn()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB25> mapB25(B25Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB25 paramData){
            MathRatingGroupB25 mathParams = new MathRatingGroupB25(
                    paramData.k(),
                    paramData.chpsi(),
                    paramData.chpi()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB26> mapB26(B26Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB26 paramData){
            MathRatingGroupB26 mathParams = new MathRatingGroupB26(
                    paramData.k(),
                    paramData.chosi(),
                    paramData.choi()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB31> mapB31(B31Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB31 paramData){
            MathRatingGroupB31 mathParams = new MathRatingGroupB31(
                    paramData.ut(),
                    paramData.doCount()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB32> mapB32(B32Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB32 paramData){
            MathRatingGroupB32 mathParams = new MathRatingGroupB32(
                    paramData.n(),
                    paramData.vo(),
                    paramData.po(),
                    paramData.npr()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB33> mapB33(B33Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB33 paramData){
            MathRatingGroupB33 mathParams = new MathRatingGroupB33(
                    paramData.cht(),
                    paramData.dv(),
                    paramData.ft(),
                    paramData.pmt()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB34> mapB34(B34Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB34 paramData){
            MathRatingGroupB34 mathParams = new MathRatingGroupB34(
                    paramData.k(),
                    paramData.hp()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB41> mapB41(B41Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB41 paramData){
            MathRatingGroupB41 mathParams = new MathRatingGroupB41(
                    paramData.n(),
                    paramData.wl(),
                    paramData.npr()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB42> mapB42(B42Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB42 paramData){
            MathRatingGroupB42 mathParams = new MathRatingGroupB42(
                    paramData.n(),
                    paramData.dn(),
                    paramData.npr()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB43> mapB43(B43Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB43 paramData){
            MathRatingGroupB43 mathParams = new MathRatingGroupB43(
                    paramData.io(),
                    paramData.iv(),
                    paramData.iz(),
                    paramData.no(),
                    paramData.nv(),
                    paramData.nz()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupB44> mapB44(B44Input input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultBGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof BGroupInputB44 paramData){
            MathRatingGroupB44 mathParams = new MathRatingGroupB44(
                    paramData.n(),
                    paramData.od(),
                    paramData.pn()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupPn> mapPn(PnInput input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof GroupInputPn paramData){
            MathRatingGroupPn mathParams = new MathRatingGroupPn(
                    paramData.pno(),
                    paramData.pnv(),
                    paramData.pnz()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private GroupData<MathRatingGroupDi> mapDi(DiInput input) {
        if (input == null){
            return null;
        }
        if(input instanceof ResultGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof GroupInputDi paramData){
            MathRatingGroupDi mathParams = new MathRatingGroupDi(
                    paramData.dio(),
                    paramData.div(),
                    paramData.diz()
            );
            return GroupData.override(mathParams);
        }

        return null;
    }

    private MathInputRatingClassV mapClassV(InputClassVWrapperDto classVWrapper){
        if(classVWrapper == null || classVWrapper.data() == null){
            return null;
        }

        List<MathInputClassVYearData> yearlyData = classVWrapper.data().stream().
                map(this::mapYearVData).collect(Collectors.toList());

        return new MathInputRatingClassV(yearlyData);
    }

    private MathInputClassVYearData mapYearVData(InputClassVDataDto classVData){
        return new MathInputClassVYearData(
                classVData.ratingYear(),
                mapGroupVData(classVData.groupData())
        );
    }

    private MathInputGroupDataV mapGroupVData(InputGroupVDataDto groupVData){
        if(groupVData == null){
            return null;
        }
        return new MathInputGroupDataV(
                mapV11(groupVData.v11()),
                mapV12(groupVData.v12()),
                mapV13(groupVData.v13()),
                mapV14(groupVData.v14()),
                mapV21(groupVData.v21()),
                mapV22(groupVData.v22()),
                mapV23(groupVData.v23()),
                mapV24(groupVData.v24()),
                mapV25(groupVData.v25()),
                mapV26(groupVData.v26()),
                mapV27(groupVData.v27()),
                mapV31(groupVData.v31()),
                mapV32(groupVData.v32()),
                mapV33(groupVData.v33()),
                mapV41(groupVData.v41()),
                mapV42(groupVData.v42()),
                mapV43(groupVData.v43()),
                mapV44(groupVData.v44()),
                mapPn(groupVData.pn()),
                mapDi(groupVData.di())
        );
    }

    private GroupData<MathRatingGroupV11> mapV11(V11Input input){
        if(input == null){
            return null;
        }
        if(input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if(input instanceof VGroupInputV11 paramData){
            MathRatingGroupV11 mathParams = new MathRatingGroupV11(
                    paramData.zmd(),
                    paramData.zm()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV12> mapV12(V12Input input){
        if(input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV12 paramData){
            MathRatingGroupV12 mathParams = new MathRatingGroupV12(
                    paramData.chz(),
                    paramData.zpk()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV13> mapV13(V13Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV13 paramData){
            MathRatingGroupV13 mathParams = new MathRatingGroupV13(
                    paramData.mdp(),
                    paramData.zpk()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV14> mapV14(V14Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV14 paramData){
            MathRatingGroupV14 mathParams = new MathRatingGroupV14(
                    paramData.prf(),
                    paramData.kco()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV21> mapV21(V21Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV21 paramData){
            MathRatingGroupV21 mathParams = new MathRatingGroupV21(
                    paramData.countNpsHavingPoa(),
                    paramData.countLicenseNps()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV22> mapV22(V22Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV22 paramData){
            MathRatingGroupV22 mathParams = new MathRatingGroupV22(
                    paramData.acp(),
                    paramData.opc(),
                    paramData.acc(),
                    paramData.nmp()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV23> mapV23(V23Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV23 paramData){
            MathRatingGroupV23 mathParams = new MathRatingGroupV23(
                    paramData.pkp(),
                    paramData.ppp(),
                    paramData.np(),
                    paramData.noa()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV24> mapV24(V24Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV24 paramData){
            MathRatingGroupV24 mathParams = new MathRatingGroupV24(
                    paramData.nap(),
                    paramData.pn()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV25> mapV25(V25Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV25 paramData){
            MathRatingGroupV25 mathParams = new MathRatingGroupV25(
                    paramData.bp(),
                    paramData.cp(),
                    paramData.nmp()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV26> mapV26(V26Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV26 paramData){
            MathRatingGroupV26 mathParams = new MathRatingGroupV26(
                    paramData.chps(),
                    paramData.chp(),
                    paramData.k()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV27> mapV27(V27Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV27 paramData){
            MathRatingGroupV27 mathParams = new MathRatingGroupV27(
                    paramData.chosi(),
                    paramData.choi(),
                    paramData.k()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV31> mapV31(V31Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV31 paramData){
            MathRatingGroupV31 mathParams = new MathRatingGroupV31(
                    paramData.dv(),
                    paramData.ft(),
                    paramData.pmt(),
                    paramData.cht()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV32> mapV32(V32Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV32 paramData){
            MathRatingGroupV32 mathParams = new MathRatingGroupV32(
                    paramData.n(),
                    paramData.vo(),
                    paramData.po(),
                    paramData.npr()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV33> mapV33(V33Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV33 paramData){
            MathRatingGroupV33 mathParams = new MathRatingGroupV33(
                    paramData.hp(),
                    paramData.k()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV41> mapV41(V41Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV41 paramData){
            MathRatingGroupV41 mathParams = new MathRatingGroupV41(
                    paramData.wl(),
                    paramData.npr(),
                    paramData.n()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV42> mapV42(V42Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV42 paramData){
            MathRatingGroupV42 mathParams = new MathRatingGroupV42(
                    paramData.dn(),
                    paramData.npr(),
                    paramData.n()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV43> mapV43(V43Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV43 paramData){
            MathRatingGroupV43 mathParams = new MathRatingGroupV43(
                    paramData.io(),
                    paramData.iv(),
                    paramData.iz(),
                    paramData.no(),
                    paramData.nv(),
                    paramData.nz()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }

    private GroupData<MathRatingGroupV44> mapV44(V44Input input){
        if (input == null){
            return null;
        }
        if (input instanceof ResultVGroup result){
            return GroupData.override(result.resultGroup());
        }
        if (input instanceof VGroupInputV44 paramData){
            MathRatingGroupV44 mathParams = new MathRatingGroupV44(
                    paramData.od(),
                    paramData.pn(),
                    paramData.n()
            );
            return GroupData.override(mathParams);
        }
        return null;
    }
}
