package ru.ystu.math.mapper;

import org.springframework.stereotype.Component;
import ru.ystu.math.dto.name.*;
import ru.ystu.math.dto.output.calc.*;
import ru.ystu.math.model.BatchNameGroups;
import ru.ystu.math.model.NameRatingClasses;
import ru.ystu.math.model.RatingResult;
import ru.ystu.math.model.json.calc.RatingClassA;
import ru.ystu.math.model.json.calc.RatingClassB;
import ru.ystu.math.model.json.calc.RatingClassV;
import ru.ystu.math.model.json.name.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public final class EntityOutputMapper {

    public OutputRatingDto toJson(List<RatingResult> entities){
        if(entities == null || entities.isEmpty()){
            return null;
        }

        BatchNameGroups batchNameGroups = entities.get(0).getBatchId();
        NameDataDto nameDataDto = mapNameData(batchNameGroups.getNameGroups());

        List<OutputClassWrapperDto> classes = new ArrayList<>();

        List<RatingResult> classAEntities = entities.stream().
                filter(e -> NameRatingClasses.A.name().equalsIgnoreCase(e.getRatingClass())).
                toList();

        if(!classAEntities.isEmpty()){
            classes.add(mapClassAWrapper(classAEntities));
        }

        List<RatingResult> classBEntities = entities.stream().
                filter(e -> NameRatingClasses.B.name().equalsIgnoreCase(e.getRatingClass())).
                toList();

        if(!classBEntities.isEmpty()){
            classes.add(mapClassBWrapper(classBEntities));
        }

        List<RatingResult> classVEntities = entities.stream().
                filter(e -> NameRatingClasses.V.name().equalsIgnoreCase(e.getRatingClass())).
                toList();

        if(!classVEntities.isEmpty()){
            classes.add(mapClassVWrapper(classVEntities));
        }

        return new OutputRatingDto(nameDataDto, classes);
    }

    private NameDataDto mapNameData(NameData nameData){
        if(nameData == null){
            return null;
        }

        return new NameDataDto(
                mapNameClass(nameData.getNameClasses()),
                mapNameGroupA(nameData.getNameGroupA()),
                mapNameGroupB(nameData.getNameGroupB()),
                mapNameGroupV(nameData.getNameGroupV())
        );
    }

    private NameClassesDto mapNameClass(NameClasses nameClasses){
        if(nameClasses == null){
            return null;
        }

        return new NameClassesDto(
                nameClasses.getA(),
                nameClasses.getB(),
                nameClasses.getV()
        );
    }

    private NameGroupADto mapNameGroupA(NameGroupA nameGroupA){
        if(nameGroupA == null){
            return null;
        }

        return new NameGroupADto(
                nameGroupA.getCodeA11(),
                nameGroupA.getCodeA21(),
                nameGroupA.getCodeA22(),
                nameGroupA.getCodeA23(),
                nameGroupA.getCodeA31(),
                nameGroupA.getCodeA32(),
                nameGroupA.getCodeA33(),
                nameGroupA.getCodeA34(),
                nameGroupA.getCodeA35(),
                nameGroupA.getCodeA36(),
                nameGroupA.getCodeA37(),
                nameGroupA.getCodePn(),
                nameGroupA.getCodeDi()
        );
    }

    private NameGroupBDto mapNameGroupB(NameGroupB nameGroupB){
        if(nameGroupB == null){
            return null;
        }

        return new NameGroupBDto(
                nameGroupB.getCodeB11(),
                nameGroupB.getCodeB12(),
                nameGroupB.getCodeB13(),
                nameGroupB.getCodeB21(),
                nameGroupB.getCodeB22(),
                nameGroupB.getCodeB23(),
                nameGroupB.getCodeB24(),
                nameGroupB.getCodeB25(),
                nameGroupB.getCodeB26(),
                nameGroupB.getCodeB31(),
                nameGroupB.getCodeB32(),
                nameGroupB.getCodeB33(),
                nameGroupB.getCodeB34(),
                nameGroupB.getCodeB41(),
                nameGroupB.getCodeB42(),
                nameGroupB.getCodeB43(),
                nameGroupB.getCodeB44(),
                nameGroupB.getCodePn(),
                nameGroupB.getCodeDi()
        );
    }

    private NameGroupVDto mapNameGroupV(NameGroupV nameGroupV){
        if(nameGroupV == null){
            return null;
        }

        return new NameGroupVDto(
                nameGroupV.getCodeV11(),
                nameGroupV.getCodeV12(),
                nameGroupV.getCodeV13(),
                nameGroupV.getCodeV14(),
                nameGroupV.getCodeV21(),
                nameGroupV.getCodeV22(),
                nameGroupV.getCodeV23(),
                nameGroupV.getCodeV24(),
                nameGroupV.getCodeV25(),
                nameGroupV.getCodeV26(),
                nameGroupV.getCodeV27(),
                nameGroupV.getCodeV31(),
                nameGroupV.getCodeV32(),
                nameGroupV.getCodeV33(),
                nameGroupV.getCodeV41(),
                nameGroupV.getCodeV42(),
                nameGroupV.getCodeV43(),
                nameGroupV.getCodeV44(),
                nameGroupV.getCodePn(),
                nameGroupV.getCodeDi()
        );
    }

    private OutputClassAWrapperDto mapClassAWrapper(List<RatingResult> classAEntities){
        List<OutputClassADataDto> dataList = classAEntities.stream().
                map(this::mapYearAData).
                collect(Collectors.toList());

        return new OutputClassAWrapperDto(NameRatingClasses.A, dataList);
    }

    private OutputClassADataDto mapYearAData(RatingResult classAEntity){
        RatingClassA ratingJson = (RatingClassA) classAEntity.getRating();

        return new OutputClassADataDto(
                classAEntity.getRatingYear(),
                mapGroupAData(ratingJson)
        );
    }

    private OutputAGroupDataDto mapGroupAData(RatingClassA classAEntity){
        if(classAEntity == null){
            return null;
        }

        return new OutputAGroupDataDto(
                classAEntity.getA11(),
                classAEntity.getA21(),
                classAEntity.getA22(),
                classAEntity.getA23(),
                classAEntity.getA31(),
                classAEntity.getA32(),
                classAEntity.getA33(),
                classAEntity.getA34(),
                classAEntity.getA35(),
                classAEntity.getA36(),
                classAEntity.getA37(),
                classAEntity.getPN(),
                classAEntity.getDI(),
                classAEntity.getKI(),
                classAEntity.getAssessment()
        );
    }

    private OutputClassBWrapperDto mapClassBWrapper(List<RatingResult> classBEntities){
        List<OutputClassBDataDto> dataList = classBEntities.stream().
                map(this::mapYearBData).
                collect(Collectors.toList());

        return new OutputClassBWrapperDto(NameRatingClasses.B, dataList);
    }

    private OutputClassBDataDto mapYearBData(RatingResult classBEntity){
        RatingClassB ratingJson = (RatingClassB) classBEntity.getRating();

        return new OutputClassBDataDto(
                classBEntity.getRatingYear(),
                mapGroupBData(ratingJson)
        );
    }

    private OutputBGroupDataDto mapGroupBData(RatingClassB classBEntity){
        if(classBEntity == null){
            return null;
        }

        return new OutputBGroupDataDto(
                classBEntity.getB11(),
                classBEntity.getB12(),
                classBEntity.getB13(),
                classBEntity.getB21(),
                classBEntity.getB22(),
                classBEntity.getB23(),
                classBEntity.getB24(),
                classBEntity.getB25(),
                classBEntity.getB26(),
                classBEntity.getB31(),
                classBEntity.getB32(),
                classBEntity.getB33(),
                classBEntity.getB34(),
                classBEntity.getB41(),
                classBEntity.getB42(),
                classBEntity.getB43(),
                classBEntity.getB44(),
                classBEntity.getPN(),
                classBEntity.getDI(),
                classBEntity.getKI(),
                classBEntity.getAssessment()
        );
    }


    private OutputClassVWrapperDto mapClassVWrapper(List<RatingResult> classVEntities){
        List<OutputClassVDataDto> dataList = classVEntities.stream().
                map(this::mapYearVData).
                collect(Collectors.toList());

        return new OutputClassVWrapperDto(NameRatingClasses.V, dataList);
    }

    private OutputClassVDataDto mapYearVData(RatingResult classVEntity){
        RatingClassV ratingJson = (RatingClassV) classVEntity.getRating();

        return new OutputClassVDataDto(
                classVEntity.getRatingYear(),
                mapGroupVData(ratingJson)
        );
    }

    private OutputVGroupDataDto mapGroupVData(RatingClassV classVEntity){
        if(classVEntity == null){
            return null;
        }

        return new OutputVGroupDataDto(
                classVEntity.getV11(),
                classVEntity.getV12(),
                classVEntity.getV13(),
                classVEntity.getV14(),
                classVEntity.getV21(),
                classVEntity.getV22(),
                classVEntity.getV23(),
                classVEntity.getV24(),
                classVEntity.getV25(),
                classVEntity.getV26(),
                classVEntity.getV27(),
                classVEntity.getV31(),
                classVEntity.getV32(),
                classVEntity.getV33(),
                classVEntity.getV41(),
                classVEntity.getV42(),
                classVEntity.getV43(),
                classVEntity.getV44(),
                classVEntity.getPN(),
                classVEntity.getDI(),
                classVEntity.getKI(),
                classVEntity.getAssessment()
        );
    }
}
