package ru.ystu.math.mapper;

import org.springframework.stereotype.Component;
import ru.ystu.math.core.model.output.*;
import ru.ystu.math.dto.name.NameDataDto;
import ru.ystu.math.dto.output.calc.*;
import ru.ystu.math.model.NameRatingClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public final class MathOutputMapper {

    public OutputRatingDto toJson(MathOutputRating outputRating, NameDataDto names){
        if (outputRating == null) {
            return null;
        }

        List<OutputClassWrapperDto> classes = new ArrayList<>();

        if(outputRating.mathOutputRatingClassA() != null){
            classes.add(mapClassA(outputRating.mathOutputRatingClassA()));
        }

        if(outputRating.mathOutputRatingClassB() != null){
            classes.add(mapClassB(outputRating.mathOutputRatingClassB()));
        }
        //TODO if (outputRating.mathOutputRatingClassA() != null){...}

        return new OutputRatingDto(names, classes);
    }

    private OutputClassAWrapperDto mapClassA(MathOutputRatingClassA outputRatingClassA){
        if (outputRatingClassA == null || outputRatingClassA.yearlyData() == null) {
            return null;
        }

        List<OutputClassADataDto> data = outputRatingClassA.yearlyData().
                stream().map(this::mapYearAData).collect(Collectors.toList());

        return new OutputClassAWrapperDto(NameRatingClasses.A, data);
    }

    private OutputClassADataDto mapYearAData(MathOutputClassAYearData yearData){
        if (yearData == null) {
            return null;
        }

        return new OutputClassADataDto(
                yearData.year(),
                mapGroupAData(yearData.groups())
        );
    }

    private OutputAGroupDataDto mapGroupAData(MathOutputGroupDataA groupData){
        if (groupData == null) {
            return null;
        }

        return new OutputAGroupDataDto(
                groupData.a11(),
                groupData.a21(),
                groupData.a22(),
                groupData.a23(),
                groupData.a31(),
                groupData.a32(),
                groupData.a33(),
                groupData.a34(),
                groupData.a35(),
                groupData.a36(),
                groupData.a37(),
                groupData.pn(),
                groupData.di(),
                groupData.ki(),
                groupData.rating()
        );
    }

    private OutputClassBWrapperDto mapClassB(MathOutputRatingClassB outputRatingClassB){
        if (outputRatingClassB == null || outputRatingClassB.yearlyData() == null) {
            return null;
        }

        List<OutputClassBDataDto> data = outputRatingClassB.yearlyData().
                stream().map(this::mapYearBData).collect(Collectors.toList());

        return new OutputClassBWrapperDto(NameRatingClasses.B, data);
    }

    private OutputClassBDataDto mapYearBData(MathOutputClassBYearData yearData){
        if (yearData == null) {
            return null;
        }

        return new OutputClassBDataDto(
                yearData.year(),
                mapGroupBData(yearData.groups())
        );
    }

    private OutputBGroupDataDto mapGroupBData(MathOutputGroupDataB groupData){
        if (groupData == null) {
            return null;
        }

        return new OutputBGroupDataDto(
                groupData.b11(),
                groupData.b12(),
                groupData.b13(),
                groupData.b21(),
                groupData.b22(),
                groupData.b23(),
                groupData.b24(),
                groupData.b25(),
                groupData.b26(),
                groupData.b31(),
                groupData.b32(),
                groupData.b33(),
                groupData.b34(),
                groupData.b41(),
                groupData.b42(),
                groupData.b43(),
                groupData.b44(),
                groupData.pn(),
                groupData.di(),
                groupData.ki(),
                groupData.rating()
        );
    }

}
