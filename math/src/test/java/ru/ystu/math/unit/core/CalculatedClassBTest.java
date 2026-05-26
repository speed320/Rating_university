package ru.ystu.math.unit.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.ystu.math.cache.MathConstantCache;
import ru.ystu.math.core.CalculatedClassB;
import ru.ystu.math.core.model.NameGroups;
import ru.ystu.math.core.model.input.GroupData;
import ru.ystu.math.core.model.input.MathInputClassBYearData;
import ru.ystu.math.core.model.input.MathInputGroupDataB;
import ru.ystu.math.core.model.input.MathInputRatingClassB;
import ru.ystu.math.core.model.input.groups.MathRatingGroupDi;
import ru.ystu.math.core.model.input.groups.MathRatingGroupPn;
import ru.ystu.math.core.model.input.groups.bgroups.*;
import ru.ystu.math.core.model.output.MathOutputRatingClassB;
import ru.ystu.math.model.MathConstant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatedClassBTest {

    @Mock
    private MathConstantCache constantCache;

    @InjectMocks
    private CalculatedClassB calculatedClassB;

    @Test
    void shouldReturnValueWithoutCalculatingThemUsingFormulasB11(){
        GroupData<MathRatingGroupB11> b11 = GroupData.override(34.26451613);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                b11, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b11()).isEqualTo(34.265);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB11(){
        MathConstant mockConstant = new MathConstant(0L, "B11", 90.0, 40.0,
                23.0, 23.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B11)).thenReturn(mockConstant);

        MathRatingGroupB11 groupB11 = new MathRatingGroupB11(0.0, 203.0, 31.6, 14.0, 72.9);
        GroupData<MathRatingGroupB11> b11 = GroupData.override(groupB11);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                b11, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b11()).isEqualTo(0.0);

    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB11(){
        MathConstant mockConstant = new MathConstant(0L, "B11", 90.0, 40.0,
                23.0, 23.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B11)).thenReturn(mockConstant);

        MathRatingGroupB11 groupB11 = new MathRatingGroupB11(0.0, 203.0, 91.6, 14.0, 72.9);
        GroupData<MathRatingGroupB11> b11 = GroupData.override(groupB11);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                b11, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);


        assertThat(result.yearlyData().get(0).groups().b11()).isEqualTo(23.0);

    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB11(){
        MathConstant mockConstant = new MathConstant(0L, "B11", 90.0, 40.0,
                23.0, 23.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B11)).thenReturn(mockConstant);

        MathRatingGroupB11 groupB11 = new MathRatingGroupB11(0.0, 203.0, 71.6, 14.0, 61.9);
        GroupData<MathRatingGroupB11> b11 = GroupData.override(groupB11);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                b11, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b11()).isEqualTo(14.248);

    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB12(){
        GroupData<MathRatingGroupB12> b12 = GroupData.override(69.697);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, b12, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b12()).isEqualTo(69.697);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB12(){
        MathConstant mockConstant = new MathConstant(0L, "B12", 100.0, 80.0,
                3.0, 3.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B12)).thenReturn(mockConstant);

        MathRatingGroupB12 groupB12 = new MathRatingGroupB12(460.0, 660.0);
        GroupData<MathRatingGroupB12> b12 = GroupData.override(groupB12);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, b12, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b12()).isEqualTo(0.0);

    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB12(){
        MathConstant mockConstant = new MathConstant(0L, "B12", 100.0, 80.0,
                3.0, 3.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B12)).thenReturn(mockConstant);

        MathRatingGroupB12 groupB12 = new MathRatingGroupB12(660.0,660.0);
        GroupData<MathRatingGroupB12> b12 = GroupData.override(groupB12);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, b12, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b12()).isEqualTo(3.0);

    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB12(){
        MathConstant mockConstant = new MathConstant(0L, "B12", 100.0, 80.0,
                3.0, 3.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B12)).thenReturn(mockConstant);

        MathRatingGroupB12 groupB12 = new MathRatingGroupB12(560.0, 660.0);
        GroupData<MathRatingGroupB12> b12 = GroupData.override(groupB12);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, b12, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b12()).isEqualTo(0.727);

    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB13(){
        GroupData<MathRatingGroupB13> b13 = GroupData.override(0.5263);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, b13,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b13()).isEqualTo(0.526);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB13(){
        MathConstant mockConstant = new MathConstant(0L, "B13", 0.5, 0.0,
                4.0, 4.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B13)).thenReturn(mockConstant);

        MathRatingGroupB13 groupB13 = new MathRatingGroupB13(0.0, 266.0);
        GroupData<MathRatingGroupB13> b13 = GroupData.override(groupB13);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, b13,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b13()).isEqualTo(0.0);

    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB13(){
        MathConstant mockConstant = new MathConstant(0L, "B13", 0.5, 0.0,
                4.0, 4.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B13)).thenReturn(mockConstant);

        MathRatingGroupB13 groupB13 = new MathRatingGroupB13(140.0, 266.0);
        GroupData<MathRatingGroupB13> b13 = GroupData.override(groupB13);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, b13,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b13()).isEqualTo(4.0);

    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB13(){
        MathConstant mockConstant = new MathConstant(0L, "B13", 0.5, 0.0,
                4.0, 4.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B13)).thenReturn(mockConstant);

        MathRatingGroupB13 groupB13 = new MathRatingGroupB13(15.0, 266.0);
        GroupData<MathRatingGroupB13> b13 = GroupData.override(groupB13);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, b13,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b13()).isEqualTo(0.451);

    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB21(){
        GroupData<MathRatingGroupB21> b21 = GroupData.override(1.0000);
        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                b21, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b21()).isEqualTo(1.0000);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB21(){
        MathConstant mockConstant = new MathConstant(0L, "B21", 1.0, 0.0,
                2.0, 2.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B21)).thenReturn(mockConstant);

        MathRatingGroupB21 groupB21 = new MathRatingGroupB21(0.0, 2.0);
        GroupData<MathRatingGroupB21> b21 = GroupData.override(groupB21);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                b21, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b21()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB21(){
        MathConstant mockConstant = new MathConstant(0L, "B21", 1.0, 0.0,
                2.0, 2.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B21)).thenReturn(mockConstant);

        MathRatingGroupB21 groupB21 = new MathRatingGroupB21(2.0, 2.0);
        GroupData<MathRatingGroupB21> b21 = GroupData.override(groupB21);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                b21, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b21()).isEqualTo(2.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB21(){
        MathConstant mockConstant = new MathConstant(0L, "B21", 1.0, 0.0,
                2.0, 2.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B21)).thenReturn(mockConstant);

        MathRatingGroupB21 groupB21 = new MathRatingGroupB21(1.0, 2.0);
        GroupData<MathRatingGroupB21> b21 = GroupData.override(groupB21);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                b21, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b21()).isEqualTo(1.0);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB22(){
        GroupData<MathRatingGroupB22> b22 = GroupData.override(0.2583);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, b22, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b22()).isEqualTo(0.258);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB22(){
        MathConstant mockConstant = new MathConstant(0L, "B22", 0.25, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B22)).thenReturn(mockConstant);

        MathRatingGroupB22 groupB22 = new MathRatingGroupB22(0.0, 0.0, 0.0, 0.0, 114.7);
        GroupData<MathRatingGroupB22> b22 = GroupData.override(groupB22);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, b22, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b22()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB22(){
        MathConstant mockConstant = new MathConstant(0L, "B22", 0.25, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B22)).thenReturn(mockConstant);

        MathRatingGroupB22 groupB22 = new MathRatingGroupB22(100.3, 21.8, 0.0, 0.0, 641.5);
        GroupData<MathRatingGroupB22> b22 = GroupData.override(groupB22);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, b22, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b22()).isEqualTo(6.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB22(){
        MathConstant mockConstant = new MathConstant(0L, "B22", 0.25, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B22)).thenReturn(mockConstant);

        MathRatingGroupB22 groupB22 = new MathRatingGroupB22(79.3, 11.8, 0.0, 0.0, 941.5);
        GroupData<MathRatingGroupB22> b22 = GroupData.override(groupB22);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, b22, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b22()).isEqualTo(2.924);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB23(){
        GroupData<MathRatingGroupB23> b23 = GroupData.override(0.3255);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, b23, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b23()).isEqualTo(0.326);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB23(){
        MathConstant mockConstant = new MathConstant(0L, "B23", 0.2, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B23)).thenReturn(mockConstant);

        MathRatingGroupB23 groupB23 = new MathRatingGroupB23(0.0, 0.0, 1073.0, 0.0);
        GroupData<MathRatingGroupB23> b23 = GroupData.override(groupB23);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, b23, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b23()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB23(){
        MathConstant mockConstant = new MathConstant(0L, "B23", 0.2, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B23)).thenReturn(mockConstant);

        MathRatingGroupB23 groupB23 = new MathRatingGroupB23(1397.0, 0.0, 1073.0, 0.0);
        GroupData<MathRatingGroupB23> b23 = GroupData.override(groupB23);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, b23, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b23()).isEqualTo(6.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB23(){
        MathConstant mockConstant = new MathConstant(0L, "B23", 0.2, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B23)).thenReturn(mockConstant);

        MathRatingGroupB23 groupB23 = new MathRatingGroupB23(397.0, 0.0, 1073.0, 0.0);
        GroupData<MathRatingGroupB23> b23 = GroupData.override(groupB23);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, b23, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b23()).isEqualTo(2.775);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB24(){
        GroupData<MathRatingGroupB24> b24 = GroupData.override(0.5000);
        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, b24, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b24()).isEqualTo(0.5000);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB24(){
        MathConstant mockConstant = new MathConstant(0L, "B24", 0.5, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B24)).thenReturn(mockConstant);

        MathRatingGroupB24 groupB24 = new MathRatingGroupB24(0.0, 941.5);
        GroupData<MathRatingGroupB24> b24 = GroupData.override(groupB24);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, b24, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b24()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB24(){
        MathConstant mockConstant = new MathConstant(0L, "B24", 0.5, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B24)).thenReturn(mockConstant);

        MathRatingGroupB24 groupB24 = new MathRatingGroupB24(100.0, 200.0);
        GroupData<MathRatingGroupB24> b24 = GroupData.override(groupB24);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, b24, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b24()).isEqualTo(6.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB24(){
        MathConstant mockConstant = new MathConstant(0L, "B24", 0.5, 0.0,
                6.0, 6.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B24)).thenReturn(mockConstant);

        MathRatingGroupB24 groupB24 = new MathRatingGroupB24(32.3, 941.5);
        GroupData<MathRatingGroupB24> b24 = GroupData.override(groupB24);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, b24, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b24()).isEqualTo(0.412);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB25(){
        GroupData<MathRatingGroupB25> b25 = GroupData.override(50.0642);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, b25, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b25()).isEqualTo(50.064);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB25(){
        MathConstant mockConstant = new MathConstant(0L, "B25", 40.0, 0.0,
                1.0, 1.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B25)).thenReturn(mockConstant);

        List<Double> chpsi = List.of(0.0, 0.0, 0.0);
        List<Double> chpi = List.of(51.0, 53.0, 47.0);

        MathRatingGroupB25 groupB25 = new MathRatingGroupB25(3, chpsi, chpi);
        GroupData<MathRatingGroupB25> b25 = GroupData.override(groupB25);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, b25, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b25()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB25(){
        MathConstant mockConstant = new MathConstant(0L, "B25", 40.0, 0.0,
                1.0, 1.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B25)).thenReturn(mockConstant);

        List<Double> chpsi = List.of(30.0, 27.0, 19.0);
        List<Double> chpi = List.of(51.0, 53.0, 47.0);

        MathRatingGroupB25 groupB25 = new MathRatingGroupB25(3, chpsi, chpi);
        GroupData<MathRatingGroupB25> b25 = GroupData.override(groupB25);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, b25, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b25()).isEqualTo(1.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB25(){
        MathConstant mockConstant = new MathConstant(0L, "B25", 40.0, 0.0,
                1.0, 1.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B25)).thenReturn(mockConstant);

        List<Double> chpsi = List.of(1.0, 2.0, 2.0);
        List<Double> chpi = List.of(51.0, 53.0, 47.0);

        MathRatingGroupB25 groupB25 = new MathRatingGroupB25(3, chpsi, chpi);
        GroupData<MathRatingGroupB25> b25 = GroupData.override(groupB25);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, b25, null,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b25()).isEqualTo(0.083);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB26(){
        GroupData<MathRatingGroupB26> b26 = GroupData.override(40.0794);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, b26,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b26()).isEqualTo(40.079);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB26(){
        MathConstant mockConstant = new MathConstant(0L, "B26", 40.0, 0.0,
                1.0, 1.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B26)).thenReturn(mockConstant);

        List<Double> chosi = List.of(0.0, 0.0, 0.0);
        List<Double> choi = List.of(4183.0, 4098.0, 4028.0);

        MathRatingGroupB26 groupB26 = new MathRatingGroupB26(3, chosi, choi);
        GroupData<MathRatingGroupB26> b26 = GroupData.override(groupB26);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, b26,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b26()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB26(){
        MathConstant mockConstant = new MathConstant(0L, "B26", 40.0, 0.0,
                1.0, 1.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B26)).thenReturn(mockConstant);

        List<Double> chosi = List.of(185.0, 150.0, 150.0);
        List<Double> choi = List.of(400.0, 409.0, 402.0);

        MathRatingGroupB26 groupB26 = new MathRatingGroupB26(3, chosi, choi);
        GroupData<MathRatingGroupB26> b26 = GroupData.override(groupB26);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, b26,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b26()).isEqualTo(1.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB26(){
        MathConstant mockConstant = new MathConstant(0L, "B26", 40.0, 0.0,
                1.0, 1.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B26)).thenReturn(mockConstant);

        List<Double> chosi = List.of(63.0, 34.0, 31.0);
        List<Double> choi = List.of(4183.0, 4098.0, 4028.0);

        MathRatingGroupB26 groupB26 = new MathRatingGroupB26(3, chosi, choi);
        GroupData<MathRatingGroupB26> b26 = GroupData.override(groupB26);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, b26,
                null, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b26()).isEqualTo(0.026);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB31(){
        GroupData<MathRatingGroupB31> b31 = GroupData.override(85.0000);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                b31, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b31()).isEqualTo(85.0000);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB31(){
        MathConstant mockConstant = new MathConstant(0L, "B31", 85.0, 30.0,
                13.0, 13.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B31)).thenReturn(mockConstant);

        MathRatingGroupB31 groupB31 = new MathRatingGroupB31(60.0, 200.0);
        GroupData<MathRatingGroupB31> b31 = GroupData.override(groupB31);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                b31, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b31()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB31(){
        MathConstant mockConstant = new MathConstant(0L, "B31", 85.0, 30.0,
                13.0, 13.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B31)).thenReturn(mockConstant);

        MathRatingGroupB31 groupB31 = new MathRatingGroupB31(136.0, 160.0);
        GroupData<MathRatingGroupB31> b31 = GroupData.override(groupB31);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                b31, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b31()).isEqualTo(13.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB31() {
        MathConstant mockConstant = new MathConstant(0L, "B31", 85.0, 30.0,
                13.0, 13.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B31)).thenReturn(mockConstant);

        MathRatingGroupB31 groupB31 = new MathRatingGroupB31(147.0, 197.0);
        GroupData<MathRatingGroupB31> b31 = GroupData.override(groupB31);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                b31, null, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b31()).isEqualTo(10.546);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB32(){
        GroupData<MathRatingGroupB32> b32 = GroupData.override(91.0460);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, b32, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b32()).isEqualTo(91.0460);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB32(){
        MathConstant mockConstant = new MathConstant(0L, "B32", 90.0, 75.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B32)).thenReturn(mockConstant);

        MathRatingGroupB32 groupB32 = new MathRatingGroupB32(1250.0, 200.0, 1450.0, 1195.0);
        GroupData<MathRatingGroupB32> b32 = GroupData.override(groupB32);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, b32, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b32()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB32(){
        MathConstant mockConstant = new MathConstant(0L, "B32", 90.0, 75.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B32)).thenReturn(mockConstant);

        MathRatingGroupB32 groupB32 = new MathRatingGroupB32(1250.0, 200.0, 362.0, 1195.0);
        GroupData<MathRatingGroupB32> b32 = GroupData.override(groupB32);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, b32, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b32()).isEqualTo(5.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB32() {
        MathConstant mockConstant = new MathConstant(0L, "B32", 90.0, 75.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B32)).thenReturn(mockConstant);

        MathRatingGroupB32 groupB32 = new MathRatingGroupB32(1250.0, 200.0, 362.0, 1209.0);
        GroupData<MathRatingGroupB32> b32 = GroupData.override(groupB32);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, b32, null, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b32()).isEqualTo(4.997);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB33(){
        GroupData<MathRatingGroupB33> b33 = GroupData.override(5.0262);
        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, b33, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b33()).isEqualTo(5.026);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB33(){
        MathConstant mockConstant = new MathConstant(0L, "B33", 5.0, 1.0,
                12.0, 12.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B33)).thenReturn(mockConstant);

        List<Double> dv = List.of(23969.0);
        List<Double> ft = List.of(219.0);
        List<Double> pmt = List.of(16507.0);

        MathRatingGroupB33 groupB33 = new MathRatingGroupB33(319.0, dv, ft, pmt);
        GroupData<MathRatingGroupB33> b33 = GroupData.override(groupB33);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, b33, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b33()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB33(){
        MathConstant mockConstant = new MathConstant(0L, "B33", 5.0, 1.0,
                12.0, 12.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B33)).thenReturn(mockConstant);

        List<Double> dv = List.of(61500.0);
        List<Double> ft = List.of(300.0);
        List<Double> pmt = List.of(11507.0);

        MathRatingGroupB33 groupB33 = new MathRatingGroupB33(319.0, dv, ft, pmt);
        GroupData<MathRatingGroupB33> b33 = GroupData.override(groupB33);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, b33, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b33()).isEqualTo(12.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB33() {
        MathConstant mockConstant = new MathConstant(0L, "B33", 5.0, 1.0,
                12.0, 12.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B33)).thenReturn(mockConstant);

        List<Double> dv = List.of(53969.0);
        List<Double> ft = List.of(300.0);
        List<Double> pmt = List.of(11507.0);

        MathRatingGroupB33 groupB33 = new MathRatingGroupB33(319.0, dv, ft, pmt);
        GroupData<MathRatingGroupB33> b33 = GroupData.override(groupB33);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, b33, null,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b33()).isEqualTo(10.232);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB34(){
        GroupData<MathRatingGroupB34> b34 = GroupData.override(1.5000);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, b34,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b34()).isEqualTo(1.5000);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB34(){
        MathConstant mockConstant = new MathConstant(0L, "B34", 1.5, 0.3,
                2.0, 2.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B34)).thenReturn(mockConstant);

        List<Double> np = List.of(0.0, 0.0, 0.3);

        MathRatingGroupB34 groupB34 = new MathRatingGroupB34(1, np);
        GroupData<MathRatingGroupB34> b34 = GroupData.override(groupB34);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, b34,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b34()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB34(){
        MathConstant mockConstant = new MathConstant(0L, "B34", 1.5, 0.3,
                2.0, 2.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B34)).thenReturn(mockConstant);

        List<Double> np = List.of(0.0, 0.0, 1.95);

        MathRatingGroupB34 groupB34 = new MathRatingGroupB34(1, np);
        GroupData<MathRatingGroupB34> b34 = GroupData.override(groupB34);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, b34,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b34()).isEqualTo(2.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB34() {
        MathConstant mockConstant = new MathConstant(0L, "B34", 1.5, 0.3,
                2.0, 2.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B34)).thenReturn(mockConstant);

        List<Double> np = List.of(0.0, 0.0, 0.95);

        MathRatingGroupB34 groupB34 = new MathRatingGroupB34(1, np);
        GroupData<MathRatingGroupB34> b34 = GroupData.override(groupB34);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, b34,
                null, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b34()).isEqualTo(1.083);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB41(){
        GroupData<MathRatingGroupB41> b41 = GroupData.override(100.0662);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                b41, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b41()).isEqualTo(100.066);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB41(){
        MathConstant mockConstant = new MathConstant(0L, "B41", 100.0, 5.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B41)).thenReturn(mockConstant);

        List<Double> wl = List.of(10.0, 11.0, 20.0);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupB41 groupB41 = new MathRatingGroupB41(3, wl, npr);
        GroupData<MathRatingGroupB41> b41 = GroupData.override(groupB41);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                b41, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b41()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB41(){
        MathConstant mockConstant = new MathConstant(0L, "B41", 100.0, 5.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B41)).thenReturn(mockConstant);

        List<Double> wl = List.of(187.0, 170.0, 170.0);
        List<Double> npr = List.of(170.1, 178.9, 178.5);

        MathRatingGroupB41 groupB41 = new MathRatingGroupB41(3, wl, npr);
        GroupData<MathRatingGroupB41> b41 = GroupData.override(groupB41);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                b41, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b41()).isEqualTo(5.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB41() {
        MathConstant mockConstant = new MathConstant(0L, "B41", 100.0, 5.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B41)).thenReturn(mockConstant);

        List<Double> wl = List.of(60.0, 70.0, 70.0);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupB41 groupB41 = new MathRatingGroupB41(3, wl, npr);
        GroupData<MathRatingGroupB41> b41 = GroupData.override(groupB41);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                b41, null, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b41()).isEqualTo(1.008);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB42(){
        GroupData<MathRatingGroupB42> b42 = GroupData.override(1008.4775);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, b42, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b42()).isEqualTo(1008.478);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB42(){
        MathConstant mockConstant = new MathConstant(0L, "B42", 1000.0, 100.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B42)).thenReturn(mockConstant);

        List<Double> dn = List.of(34567.4, 26735.9, 20601.1);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupB42 groupB42 = new MathRatingGroupB42(3, dn, npr);
        GroupData<MathRatingGroupB42> b42 = GroupData.override(groupB42);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, b42, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b42()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB42(){
        MathConstant mockConstant = new MathConstant(0L, "B42", 1000.0, 100.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B42)).thenReturn(mockConstant);

        List<Double> dn = List.of(138567.4, 216735.9, 483281.1);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupB42 groupB42 = new MathRatingGroupB42(3, dn, npr);
        GroupData<MathRatingGroupB42> b42 = GroupData.override(groupB42);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, b42, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b42()).isEqualTo(5.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB42() {
        MathConstant mockConstant = new MathConstant(0L, "B42", 1000.0, 100.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B42)).thenReturn(mockConstant);

        List<Double> dn = List.of(38567.4, 96735.9, 483281.1);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupB42 groupB42 = new MathRatingGroupB42(3, dn, npr);
        GroupData<MathRatingGroupB42> b42 = GroupData.override(groupB42);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, b42, null, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b42()).isEqualTo(3.565);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB43(){
        GroupData<MathRatingGroupB43> b43 = GroupData.override(15.0845);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, b43, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b43()).isEqualTo(15.085);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB43(){
        MathConstant mockConstant = new MathConstant(0L, "B43", 15.0, 1.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B43)).thenReturn(mockConstant);

        MathRatingGroupB43 groupB43 = new MathRatingGroupB43(31.0, 8.0, 10.0, 3296.0, 240.0, 1412.0);
        GroupData<MathRatingGroupB43> b43 = GroupData.override(groupB43);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, b43, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b43()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB43(){
        MathConstant mockConstant = new MathConstant(0L, "B43", 15.0, 1.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B43)).thenReturn(mockConstant);

        MathRatingGroupB43 groupB43 = new MathRatingGroupB43(72.0, 8.0, 10.0, 296.0, 240.0, 412.0);
        GroupData<MathRatingGroupB43> b43 = GroupData.override(groupB43);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, b43, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b43()).isEqualTo(5.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB43() {
        MathConstant mockConstant = new MathConstant(0L, "B43", 15.0, 1.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B43)).thenReturn(mockConstant);

        MathRatingGroupB43 groupB43 = new MathRatingGroupB43(47.0, 8.0, 10.0, 3296.0, 240.0, 1412.0);
        GroupData<MathRatingGroupB43> b43 = GroupData.override(groupB43);

        MathInputRatingClassB ratingClassB = generateRatingClassB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, b43, null,
                null, null);

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b43()).isEqualTo(0.153);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasB44(){
        GroupData<MathRatingGroupB44> b44 = GroupData.override(502.0458);
        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null,  null, null, null,
                null, null, null, b44,
                null, null
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b44()).isEqualTo(502.046);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInZeroCaseB44(){
        MathConstant mockConstant = new MathConstant(0L, "B44", 500.0, 50.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B44)).thenReturn(mockConstant);

        List<Double> od = List.of(100000.0, 420000.0, 10085.7);
        List<Double> pn = List.of(3520.7, 3569.9, 3497.2);

        MathRatingGroupB44 groupB44 = new MathRatingGroupB44(3, od, pn);
        GroupData<MathRatingGroupB44> b44 = GroupData.override(groupB44);

        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, b44,
                null, null
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b44()).isEqualTo(0.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOneCaseB44(){
        MathConstant mockConstant = new MathConstant(0L, "B44", 500.0, 50.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B44)).thenReturn(mockConstant);

        List<Double> od = List.of(2100316.0, 1870778.8, 1348285.7);
        List<Double> pn = List.of(3520.7, 3569.9, 3497.2);

        MathRatingGroupB44 groupB44 = new MathRatingGroupB44(3, od, pn);
        GroupData<MathRatingGroupB44> b44 = GroupData.override(groupB44);

        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, b44,
                null, null
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b44()).isEqualTo(5.0);
    }

    @Test
    void itShouldReturnValueCalculatedUsingFormulasWithNormalizationInOtherCasesB44() {
        MathConstant mockConstant = new MathConstant(0L, "B44", 500.0, 50.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.B44)).thenReturn(mockConstant);

        List<Double> od = List.of(760316.0, 870778.8, 1348285.7);
        List<Double> pn = List.of(3520.7, 3569.9, 3497.2);

        MathRatingGroupB44 groupB44 = new MathRatingGroupB44(3, od, pn);
        GroupData<MathRatingGroupB44> b44 = GroupData.override(groupB44);

        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, b44,
                null, null
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().b44()).isEqualTo(2.576);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasPn(){
        GroupData<MathRatingGroupPn> pn = GroupData.override(941.5000);
        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null,  null, null, null,
                null, null, null, null,
                pn, null
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().pn()).isEqualTo(941.5000);
    }

    @Test
    void testPN(){
        MathRatingGroupPn groupPn = new MathRatingGroupPn(907.0, 0.0, 345.0);
        GroupData<MathRatingGroupPn> pn = GroupData.override(groupPn);

        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                pn, null
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().pn()).isEqualTo(941.5);
    }

    @Test
    void itShouldReturnValueWithoutCalculatingThemUsingFormulasDi(){
        GroupData<MathRatingGroupDi> di = GroupData.override(19.3000);
        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null,  null, null, null,
                null, null, null, null,
                null, di
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().di()).isEqualTo(19.3);
    }

    @Test
    void testDi(){
        MathRatingGroupDi groupDi = new MathRatingGroupDi(19.0, 0.0, 3.0);
        GroupData<MathRatingGroupDi> di = GroupData.override(groupDi);

        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, di
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().di()).isEqualTo(19.3);
    }

    @Test
    void testKi(){
        MathRatingGroupPn groupPn = new MathRatingGroupPn(907.0, 0.0, 345.0);
        GroupData<MathRatingGroupPn> pn = GroupData.override(groupPn);

        MathRatingGroupDi groupDi = new MathRatingGroupDi(19.0, 0.0, 3.0);
        GroupData<MathRatingGroupDi> di = GroupData.override(groupDi);

        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                null, null, null,
                null, null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                pn, di
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        MathInputRatingClassB ratingClassB = new MathInputRatingClassB(
                yearlyData
        );

        MathOutputRatingClassB result = calculatedClassB.calculateClass(ratingClassB);

        assertThat(result.yearlyData().get(0).groups().ki()).isEqualTo(1.0);
    }

    private MathInputRatingClassB generateRatingClassB(GroupData<MathRatingGroupB11> b11,
                                                       GroupData<MathRatingGroupB12> b12,
                                                       GroupData<MathRatingGroupB13> b13,
                                                       GroupData<MathRatingGroupB21> b21,
                                                       GroupData<MathRatingGroupB22> b22,
                                                       GroupData<MathRatingGroupB23> b23,
                                                       GroupData<MathRatingGroupB24> b24,
                                                       GroupData<MathRatingGroupB25> b25,
                                                       GroupData<MathRatingGroupB26> b26,
                                                       GroupData<MathRatingGroupB31> b31,
                                                       GroupData<MathRatingGroupB32> b32,
                                                       GroupData<MathRatingGroupB33> b33,
                                                       GroupData<MathRatingGroupB34> b34,
                                                       GroupData<MathRatingGroupB41> b41,
                                                       GroupData<MathRatingGroupB42> b42,
                                                       GroupData<MathRatingGroupB43> b43,
                                                       GroupData<MathRatingGroupB44> b44,
                                                       GroupData<MathRatingGroupPn> pn,
                                                       GroupData<MathRatingGroupDi> di) {

        MathInputGroupDataB groupDataB =new MathInputGroupDataB(
                b11, b12, b13,
                b21, b22, b23, b24, b25, b26,
                b31, b32, b33, b34,
                b41, b42, b43, b44,
                pn, di
        );

        MathInputClassBYearData yearData = new MathInputClassBYearData(
                2025,
                groupDataB
        );

        List<MathInputClassBYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        return new MathInputRatingClassB(
                yearlyData
        );
    }
}
