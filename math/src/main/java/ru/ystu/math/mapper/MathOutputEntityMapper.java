package ru.ystu.math.mapper;

import org.springframework.stereotype.Component;
import ru.ystu.math.core.model.output.*;
import ru.ystu.math.dto.name.*;
import ru.ystu.math.model.BatchNameGroups;
import ru.ystu.math.model.NameRatingClasses;
import ru.ystu.math.model.RatingResult;
import ru.ystu.math.model.json.calc.Rating;
import ru.ystu.math.model.json.calc.RatingClassA;
import ru.ystu.math.model.json.calc.RatingClassB;
import ru.ystu.math.model.json.calc.RatingClassV;
import ru.ystu.math.model.json.name.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public final class MathOutputEntityMapper {

    public BatchNameGroups toBatchEntity(UUID batchId, NameDataDto nameDataDto) {
        BatchNameGroups batchEntity = new BatchNameGroups();
        batchEntity.setBatchId(batchId);
        batchEntity.setNameGroups(mapNameData(nameDataDto));
        return batchEntity;
    }

    private NameData mapNameData(NameDataDto nameDataDto) {
        if(nameDataDto == null) {
            return null;
        }
        return NameData.builder().
                nameClasses(mapNameClasses(nameDataDto.nameClasses())).
                nameGroupA(mapNameGroupA(nameDataDto.nameGroupA())).
                nameGroupB(mapNameGroupB(nameDataDto.nameGroupB())).
                nameGroupV(mapNameGroupV(nameDataDto.nameGroupV())).build();
    }

    private NameClasses mapNameClasses(NameClassesDto nameClassesDto) {
        if(nameClassesDto == null) {
            return null;
        }
        return NameClasses.builder().
                A(nameClassesDto.A()).
                B(nameClassesDto.B()).
                V(nameClassesDto.V()).build();
    }

    private NameGroupA mapNameGroupA(NameGroupADto nameGroupADto) {
        if(nameGroupADto == null) {
            return null;
        }
        return NameGroupA.builder().
                codeA11(nameGroupADto.codeA11()).
                codeA21(nameGroupADto.codeA21()).
                codeA22(nameGroupADto.codeA22()).
                codeA23(nameGroupADto.codeA23()).
                codeA31(nameGroupADto.codeA31()).
                codeA32(nameGroupADto.codeA32()).
                codeA33(nameGroupADto.codeA33()).
                codeA34(nameGroupADto.codeA34()).
                codeA35(nameGroupADto.codeA35()).
                codeA36(nameGroupADto.codeA36()).
                codeA37(nameGroupADto.codeA37()).
                codePn(nameGroupADto.codePn()).
                codeDi(nameGroupADto.codeDi()).build();
    }

    private NameGroupB mapNameGroupB(NameGroupBDto nameGroupBDto) {
        if(nameGroupBDto == null) {
            return null;
        }
        return NameGroupB.builder().
                codeB11(nameGroupBDto.codeB11()).
                codeB12(nameGroupBDto.codeB12()).
                codeB13(nameGroupBDto.codeB13()).
                codeB21(nameGroupBDto.codeB21()).
                codeB22(nameGroupBDto.codeB22()).
                codeB23(nameGroupBDto.codeB23()).
                codeB24(nameGroupBDto.codeB24()).
                codeB25(nameGroupBDto.codeB25()).
                codeB26(nameGroupBDto.codeB26()).
                codeB31(nameGroupBDto.codeB31()).
                codeB32(nameGroupBDto.codeB32()).
                codeB33(nameGroupBDto.codeB33()).
                codeB34(nameGroupBDto.codeB34()).
                codeB41(nameGroupBDto.codeB41()).
                codeB42(nameGroupBDto.codeB42()).
                codeB43(nameGroupBDto.codeB43()).
                codeB44(nameGroupBDto.codeB44()).
                codePn(nameGroupBDto.codePn()).
                codeDi(nameGroupBDto.codeDi())
                .build();
    }

    private NameGroupV mapNameGroupV(NameGroupVDto nameGroupVDto) {
        if(nameGroupVDto == null) {
            return null;
        }
        return NameGroupV.builder().
                codeV11(nameGroupVDto.codeV11()).
                codeV12(nameGroupVDto.codeV12()).
                codeV13(nameGroupVDto.codeV13()).
                codeV14(nameGroupVDto.codeV14()).
                codeV21(nameGroupVDto.codeV21()).
                codeV22(nameGroupVDto.codeV22()).
                codeV23(nameGroupVDto.codeV23()).
                codeV24(nameGroupVDto.codeV24()).
                codeV25(nameGroupVDto.codeV25()).
                codeV26(nameGroupVDto.codeV26()).
                codeV27(nameGroupVDto.codeV27()).
                codeV31(nameGroupVDto.codeV31()).
                codeV32(nameGroupVDto.codeV32()).
                codeV33(nameGroupVDto.codeV33()).
                codeV41(nameGroupVDto.codeV41()).
                codeV42(nameGroupVDto.codeV42()).
                codeV43(nameGroupVDto.codeV43()).
                codeV44(nameGroupVDto.codeV44()).
                codePn(nameGroupVDto.codePn()).
                codeDi(nameGroupVDto.codeDi())
                .build();
    }

    public List<RatingResult> toRatingResultEntities(MathOutputRating outputRating,
                                                     BatchNameGroups savedBatch) {
        List<RatingResult> ratingResultEntities = new ArrayList<>();
        if(outputRating == null) {
            return ratingResultEntities;
        }

        if(outputRating.mathOutputRatingClassA() != null) {
            for(MathOutputClassAYearData yearData : outputRating.mathOutputRatingClassA().yearlyData()){
                RatingResult ratingResult = new RatingResult();
                ratingResult.setRatingClass(NameRatingClasses.A.name());
                ratingResult.setRatingYear(yearData.year());
                ratingResult.setBatchId(savedBatch);

                Rating ratingJson = mapRatingClassA(yearData.groups());

                ratingResult.setRating(ratingJson);

                ratingResultEntities.add(ratingResult);
            }
        }

        if(outputRating.mathOutputRatingClassB() != null) {
            for(MathOutputClassBYearData yearData : outputRating.mathOutputRatingClassB().yearlyData()){
                RatingResult ratingResult = new RatingResult();
                ratingResult.setRatingClass(NameRatingClasses.B.name());
                ratingResult.setRatingYear(yearData.year());
                ratingResult.setBatchId(savedBatch);

                Rating ratingJson = mapRatingClassB(yearData.groups());

                ratingResult.setRating(ratingJson);

                ratingResultEntities.add(ratingResult);
            }
        }

        if(outputRating.mathOutputRatingClassV() != null) {
            for (MathOutputClassVYearData yearData : outputRating.mathOutputRatingClassV().yearlyData()) {
                RatingResult ratingResult = new RatingResult();
                ratingResult.setRatingClass(NameRatingClasses.V.name());
                ratingResult.setRatingYear(yearData.year());
                ratingResult.setBatchId(savedBatch);

                Rating ratingJson = mapRatingClassV(yearData.groups());

                ratingResult.setRating(ratingJson);

                ratingResultEntities.add(ratingResult);
            }
        }

        return ratingResultEntities;

    }

    private RatingClassA mapRatingClassA(MathOutputGroupDataA groupDataA) {
        if(groupDataA == null) {
            return null;
        }

        return RatingClassA.builder().
                A11(groupDataA.a11()).
                A21(groupDataA.a21()).
                A22(groupDataA.a22()).
                A23(groupDataA.a23()).
                A31(groupDataA.a31()).
                A32(groupDataA.a32()).
                A33(groupDataA.a33()).
                A34(groupDataA.a34()).
                A35(groupDataA.a35()).
                A36(groupDataA.a36()).
                A37(groupDataA.a37()).
                PN(groupDataA.pn()).
                DI(groupDataA.di()).
                KI(groupDataA.ki()).
                assessment(groupDataA.rating()).build();
    }

    private RatingClassB mapRatingClassB(MathOutputGroupDataB groupDataB) {
        if(groupDataB == null) {
            return null;
        }

        return RatingClassB.builder().
                B11(groupDataB.b11()).
                B12(groupDataB.b12()).
                B13(groupDataB.b13()).
                B21(groupDataB.b21()).
                B22(groupDataB.b22()).
                B23(groupDataB.b23()).
                B24(groupDataB.b24()).
                B25(groupDataB.b25()).
                B26(groupDataB.b26()).
                B31(groupDataB.b31()).
                B32(groupDataB.b32()).
                B33(groupDataB.b33()).
                B34(groupDataB.b34()).
                B41(groupDataB.b41()).
                B42(groupDataB.b42()).
                B43(groupDataB.b43()).
                B44(groupDataB.b44()).
                PN(groupDataB.pn()).
                DI(groupDataB.di()).
                KI(groupDataB.ki()).
                assessment(groupDataB.rating()).build();
    }

    private RatingClassV mapRatingClassV(MathOutputGroupDataV groupDataV) {
        if(groupDataV == null) {
            return null;
        }

        return RatingClassV.builder().
                V11(groupDataV.v11()).
                V12(groupDataV.v12()).
                V13(groupDataV.v13()).
                V14(groupDataV.v14()).
                V21(groupDataV.v21()).
                V22(groupDataV.v22()).
                V23(groupDataV.v23()).
                V24(groupDataV.v24()).
                V25(groupDataV.v25()).
                V26(groupDataV.v26()).
                V27(groupDataV.v27()).
                V31(groupDataV.v31()).
                V32(groupDataV.v32()).
                V33(groupDataV.v33()).
                V41(groupDataV.v41()).
                V42(groupDataV.v42()).
                V43(groupDataV.v43()).
                V44(groupDataV.v44()).
                PN(groupDataV.pn()).
                DI(groupDataV.di()).
                assessment(groupDataV.assessment())
                .build();
    }
}
