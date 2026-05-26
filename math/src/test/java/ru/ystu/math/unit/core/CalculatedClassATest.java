package ru.ystu.math.unit.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.ystu.math.cache.MathConstantCache;
import ru.ystu.math.core.CalculatedClassA;
import ru.ystu.math.core.model.NameGroups;
import ru.ystu.math.core.model.input.GroupData;
import ru.ystu.math.core.model.input.MathInputClassAYearData;
import ru.ystu.math.core.model.input.MathInputGroupDataA;
import ru.ystu.math.core.model.input.MathInputRatingClassA;
import ru.ystu.math.core.model.input.groups.MathRatingGroupDi;
import ru.ystu.math.core.model.input.groups.MathRatingGroupPn;
import ru.ystu.math.core.model.input.groups.agroups.*;
import ru.ystu.math.core.model.output.MathOutputRatingClassA;
import ru.ystu.math.model.MathConstant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatedClassATest {

    @Mock
    private MathConstantCache constantCache;

    @InjectMocks
    private CalculatedClassA calculatedClassA;

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaA11(){
        GroupData<MathRatingGroupA11> a11 = GroupData.override(3.423);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                a11,
                null, null, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a11()).isEqualTo(3.423);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInZeroCaseA11(){
        MathConstant mockConstant = new MathConstant(0L, "A11", 100.0, 80.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A11)).thenReturn(mockConstant);

        MathRatingGroupA11 groupA11 = new MathRatingGroupA11(3.0, 12.0);
        GroupData<MathRatingGroupA11> a11 = GroupData.override(groupA11);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                a11,
                null, null, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a11()).isEqualTo(0.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOneCaseA11(){
        MathConstant mockConstant = new MathConstant(0L, "A11", 100.0, 80.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A11)).thenReturn(mockConstant);

        MathRatingGroupA11 groupA11 = new MathRatingGroupA11(12.0, 12.0);
        GroupData<MathRatingGroupA11> a11 = GroupData.override(groupA11);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                a11,
                null, null, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a11()).isEqualTo(5.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseA11(){
        MathConstant mockConstant = new MathConstant(0L, "A11", 100.0, 80.0,
                5.0, 5.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A11)).thenReturn(mockConstant);

        MathRatingGroupA11 groupA11 = new MathRatingGroupA11(12.18, 13.0);
        GroupData<MathRatingGroupA11> a11 = GroupData.override(groupA11);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                a11,
                null, null, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a11()).isEqualTo(3.423);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaA21(){
        GroupData<MathRatingGroupA21> a21 = GroupData.override(79.0513);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                a21, null, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a21()).isEqualTo(79.051);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInZeroCaseA21(){
        MathConstant mockConstant = new MathConstant(0L, "A21", 80.0, 20.0,
                25.0, 25.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A21)).thenReturn(mockConstant);

        MathRatingGroupA21 groupA21 = new MathRatingGroupA21(2.0, 13.0);
        GroupData<MathRatingGroupA21> a21 = GroupData.override(groupA21);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                a21, null, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a21()).isEqualTo(0.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOneCaseA21(){
        MathConstant mockConstant = new MathConstant(0L, "A21", 80.0, 20.0,
                25.0, 25.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A21)).thenReturn(mockConstant);

        MathRatingGroupA21 groupA21 = new MathRatingGroupA21(2.0, 2.02);
        GroupData<MathRatingGroupA21> a21 = GroupData.override(groupA21);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                a21, null, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a21()).isEqualTo(25.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseA21(){
        MathConstant mockConstant = new MathConstant(0L, "A21", 80.0, 20.0,
                25.0, 25.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A21)).thenReturn(mockConstant);

        MathRatingGroupA21 groupA21 = new MathRatingGroupA21(2.0, 2.53);
        GroupData<MathRatingGroupA21> a21 = GroupData.override(groupA21);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                a21, null, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a21()).isEqualTo(24.605);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaA22(){
        GroupData<MathRatingGroupA22> a22 = GroupData.override(0.123);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, a22, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a22()).isEqualTo(0.123);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInZeroCaseA22(){
        MathConstant mockConstant = new MathConstant(0L, "A22", 50.0, 10.0, 25.0, 25.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A22)).thenReturn(mockConstant);

        MathRatingGroupA22 groupA22 = new MathRatingGroupA22(2.0, 20.9);
        GroupData<MathRatingGroupA22> a22 = GroupData.override(groupA22);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, a22, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a22()).isEqualTo(0.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOneCaseA22(){
        MathConstant mockConstant = new MathConstant(0L, "A22", 50.0, 10.0, 25.0, 25.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A22)).thenReturn(mockConstant);

        MathRatingGroupA22 groupA22 = new MathRatingGroupA22(2.0, 2.94);
        GroupData<MathRatingGroupA22> a22 = GroupData.override(groupA22);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, a22, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a22()).isEqualTo(25.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseA22(){
        MathConstant mockConstant = new MathConstant(0L, "A22", 50.0, 10.0, 25.0, 25.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A22)).thenReturn(mockConstant);

        MathRatingGroupA22 groupA22 = new MathRatingGroupA22(2.7, 10.8);
        GroupData<MathRatingGroupA22> a22 = GroupData.override(groupA22);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, a22, null,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a22()).isEqualTo(9.375);
    }

    @Test
    void shouldReturnValueWithoutCalculatingThemUsingFormulaA23(){
        GroupData<MathRatingGroupA23> a23 = GroupData.override(0.56);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, a23,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a23()).isEqualTo(0.56);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulasWithCheckingFalseA23(){
        MathRatingGroupA23 groupA23 = new MathRatingGroupA23(0.0, 1.0);
        GroupData<MathRatingGroupA23> a23 = GroupData.override(groupA23);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, a23,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a23()).isEqualTo(0.56);

    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulasWithCheckingFalseA23WhereCvZero(){
        MathRatingGroupA23 groupA23 = new MathRatingGroupA23(2.0, 0.0);
        GroupData<MathRatingGroupA23> a23 = GroupData.override(groupA23);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, a23,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a23()).isEqualTo(0.56);
    }

    @Test
    void shouldRaturnValueWithCalculatingThemUsingFormulasWithCheckingTrueA23(){
        MathConstant mockConstant = new MathConstant(0L, "A23", 90.0, 30.0,
                1.0, 1.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A23)).thenReturn(mockConstant);

        MathRatingGroupA23 groupA23 = new MathRatingGroupA23(2.5, 4.0);
        GroupData<MathRatingGroupA23> a23 = GroupData.override(groupA23);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, a23,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a23()).isEqualTo(0.542);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulasWithNormalizationInZeroCaseA23(){
        MathConstant mockConstant = new MathConstant(0L, "A23", 90.0, 30.0,
                1.0, 1.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A23)).thenReturn(mockConstant);

        MathRatingGroupA23 groupA23 = new MathRatingGroupA23(1.0, 5.0);
        GroupData<MathRatingGroupA23> a23 = GroupData.override(groupA23);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, a23,
                null, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a23()).isEqualTo(0.0);
    }

    @Test
    void shouldReturnValueWithoutCalculatingThemUsingFormulaA31(){
        GroupData<MathRatingGroupA31> a31 = GroupData.override(24.149);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                a31, null, null, null, null, null, null,
                null, null
         );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a31()).isEqualTo(24.149);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInZeroCaseA31(){
        MathConstant mockConstant = new MathConstant(0L, "A31", 100.0, 5.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A31)).thenReturn(mockConstant);

        List<Double> wl = List.of(10.0, 10.0, 10.0);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupA31 groupA31 = new MathRatingGroupA31(wl, npr, 3);
        GroupData<MathRatingGroupA31> a31 = GroupData.override(groupA31);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                a31, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a31()).isEqualTo(0.0);

    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOneCaseA31(){
        MathConstant mockConstant = new MathConstant(0L, "A31", 100.0, 5.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A31)).thenReturn(mockConstant);

        List<Double> wl = List.of(160.0, 170.0, 270.0);
        List<Double> npr = List.of(170.1, 178.9, 239.5);

        MathRatingGroupA31 groupA31 = new MathRatingGroupA31(wl, npr, 3);
        GroupData<MathRatingGroupA31> a31 = GroupData.override(groupA31);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                a31, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a31()).isEqualTo(8.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseA31(){
        MathConstant mockConstant = new MathConstant(0L, "A31", 100.0, 5.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A31)).thenReturn(mockConstant);

        List<Double> wl = List.of(60.0, 70.0, 70.0);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupA31 groupA31 = new MathRatingGroupA31(wl, npr, 3);
        GroupData<MathRatingGroupA31> a31 = GroupData.override(groupA31);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                a31, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a31()).isEqualTo(1.613);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseOnTwoYearA31(){
        MathConstant mockConstant = new MathConstant(0L, "A31", 100.0, 5.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A31)).thenReturn(mockConstant);

        List<Double> wl = List.of(0.0, 70.0, 70.0);
        List<Double> npr = List.of(0.0, 278.9, 278.5);

        MathRatingGroupA31 groupA31 = new MathRatingGroupA31(wl, npr, 2);
        GroupData<MathRatingGroupA31> a31 = GroupData.override(groupA31);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                a31, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a31()).isEqualTo(1.694);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseOnOneYearA31(){
        MathConstant mockConstant = new MathConstant(0L, "A31", 100.0, 5.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A31)).thenReturn(mockConstant);

        List<Double> wl = List.of(0.0, 0.0, 70.0);
        List<Double> npr = List.of(0.0, 0.0, 278.5);

        MathRatingGroupA31 groupA31 = new MathRatingGroupA31(wl, npr, 1);
        GroupData<MathRatingGroupA31> a31 = GroupData.override(groupA31);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                a31, null, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a31()).isEqualTo(1.696);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaA32(){
        GroupData<MathRatingGroupA32> a32 = GroupData.override(680.0);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, a32, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a32()).isEqualTo(680.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInZeroCaseA32(){
        MathConstant mockConstant = new MathConstant(0L, "A32", 1000.0, 100.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A32)).thenReturn(mockConstant);

        List<Double> dn = List.of(3857.4, 9635.9, 48281.1);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupA32 groupA32 = new MathRatingGroupA32(dn, npr, 3);
        GroupData<MathRatingGroupA32> a32 = GroupData.override(groupA32);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, a32, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a32()).isEqualTo(0.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOneCaseA32(){
        MathConstant mockConstant = new MathConstant(0L, "A32", 1000.0, 100.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A32)).thenReturn(mockConstant);

        List<Double> dn = List.of(148567.4, 196735.9, 493281.1);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupA32 groupA32 = new MathRatingGroupA32(dn, npr, 3);
        GroupData<MathRatingGroupA32> a32 = GroupData.override(groupA32);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, a32, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a32()).isEqualTo(8.0);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseA32(){
        MathConstant mockConstant = new MathConstant(0L, "A32", 1000.0, 100.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A32)).thenReturn(mockConstant);

        List<Double> dn = List.of(38567.4, 96735.9, 483281.1);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupA32 groupA32 = new MathRatingGroupA32(dn, npr, 3);
        GroupData<MathRatingGroupA32> a32 = GroupData.override(groupA32);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, a32, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a32()).isEqualTo(5.704);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseOnTwoYearA32(){
        MathConstant mockConstant = new MathConstant(0L, "A32", 1000.0, 100.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A32)).thenReturn(mockConstant);

        List<Double> dn = List.of(96735.9, 183281.1);
        List<Double> npr = List.of(278.9, 278.5);

        MathRatingGroupA32 groupA32 = new MathRatingGroupA32(dn, npr, 2);
        GroupData<MathRatingGroupA32> a32 = GroupData.override(groupA32);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, a32, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a32()).isEqualTo(3.578);
    }

    @Test
    void shouldReturnValueWithCalculatingThemUsingFormulaWithNormalizationInOtherCaseOnOneYearA32(){
        MathConstant mockConstant = new MathConstant(0L, "A32", 1000.0, 100.0, 8.0, 8.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A32)).thenReturn(mockConstant);

        List<Double> dn = List.of(183281.1);
        List<Double> npr = List.of(278.5);

        MathRatingGroupA32 groupA32 = new MathRatingGroupA32(dn, npr, 1);
        GroupData<MathRatingGroupA32> a32 = GroupData.override(groupA32);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, a32, null, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a32()).isEqualTo(4.961);
    }

    @Test
    void shouldReturnValueCalculatedUsingFormulasA33(){
        GroupData<MathRatingGroupA33> a33 = GroupData.override(4.000);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, null, a33, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a33()).isEqualTo(4.000);
    }

    @Test
    void shouldReturnValueCalculatedUsingFormulasWithNormalizationZeroCaseA33(){
        MathConstant mathConstant = new MathConstant(0L, "A33", 500.0, 50.0, 4.0, 4.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A33)).thenReturn(mathConstant);

        List<Double> rdn = List.of(24155.0, 3435.9, 4306.2);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupA33 groupA33 = new MathRatingGroupA33(rdn, npr, 3);
        GroupData<MathRatingGroupA33> a33 = GroupData.override(groupA33);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, null, a33, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a33()).isEqualTo(0.0);
    }

    @Test
    void shouldReturnValueCalculatedUsingFormulasWithNormalizationOneCaseA33(){
        MathConstant mathConstant = new MathConstant(0L, "A33", 500.0, 50.0, 4.0, 4.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A33)).thenReturn(mathConstant);

        List<Double> rdn = List.of(24155.0, 83435.9, 460306.2);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupA33 groupA33 = new MathRatingGroupA33(rdn, npr, 3);
        GroupData<MathRatingGroupA33> a33 = GroupData.override(groupA33);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, null, a33, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a33()).isEqualTo(4.0);
    }

    @Test
    void shouldReturnValueCalculatedUsingFormulasWithNormalizationOtherCaseA33(){
        MathConstant mathConstant = new MathConstant(0L, "A33", 500.0, 50.0, 4.0, 4.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A33)).thenReturn(mathConstant);

        List<Double> rdn = List.of(24155.0, 83435.9, 46306.2);
        List<Double> npr = List.of(270.1, 278.9, 278.5);

        MathRatingGroupA33 groupA33 = new MathRatingGroupA33(rdn, npr, 3);
        GroupData<MathRatingGroupA33> a33 = GroupData.override(groupA33);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, null, a33, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a33()).isEqualTo(1.2);
    }

    @Test
    void shouldReturnValueCalculatedUsingFormulasWithNormalizationOtherCaseOnTwoYearA33(){
        MathConstant mathConstant = new MathConstant(0L, "A33", 500.0, 50.0, 4.0, 4.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A33)).thenReturn(mathConstant);

        List<Double> rdn = List.of(83435.9, 46306.2);
        List<Double> npr = List.of(278.9, 278.5);

        MathRatingGroupA33 groupA33 = new MathRatingGroupA33(rdn, npr, 2);
        GroupData<MathRatingGroupA33> a33 = GroupData.override(groupA33);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, null, a33, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a33()).isEqualTo(1.624);
    }

    @Test
    void shouldReturnValueCalculatedUsingFormulasWithNormalizationOtherCaseOnOneYearA33(){
        MathConstant mathConstant = new MathConstant(0L, "A33", 500.0, 50.0, 4.0, 4.0, Instant.now());
        when(constantCache.getConstant(NameGroups.A33)).thenReturn(mathConstant);

        List<Double> rdn = List.of(46306.2);
        List<Double> npr = List.of(278.5);

        MathRatingGroupA33 groupA33 = new MathRatingGroupA33(rdn, npr, 1);
        GroupData<MathRatingGroupA33> a33 = GroupData.override(groupA33);

        MathInputRatingClassA ratingClassA = generateRatingClassA(
                null,
                null, null, null,
                null, null, a33, null, null, null, null,
                null, null
        );

        MathOutputRatingClassA result = calculatedClassA.calculateClass(ratingClassA);

        assertThat(result.yearlyData().get(0).groups().a33()).isEqualTo(1.034);
    }

    private MathInputRatingClassA generateRatingClassA(GroupData<MathRatingGroupA11> a11,
                                                        GroupData<MathRatingGroupA21> a21,
                                                        GroupData<MathRatingGroupA22> a22,
                                                        GroupData<MathRatingGroupA23> a23,
                                                        GroupData<MathRatingGroupA31> a31,
                                                        GroupData<MathRatingGroupA32> a32,
                                                        GroupData<MathRatingGroupA33> a33,
                                                        GroupData<MathRatingGroupA34> a34,
                                                        GroupData<MathRatingGroupA35> a35,
                                                        GroupData<MathRatingGroupA36> a36,
                                                        GroupData<MathRatingGroupA37> a37,
                                                        GroupData<MathRatingGroupPn> pn,
                                                        GroupData<MathRatingGroupDi> di){

        MathInputGroupDataA groupDataA = new MathInputGroupDataA(
                a11,
                a21, a22, a23,
                a31, a32, a33, a34, a35, a36, a37,
                pn, di
        );

        MathInputClassAYearData yearData = new MathInputClassAYearData(
                2025,
                groupDataA);

        List<MathInputClassAYearData> yearlyData = new ArrayList<>();
        yearlyData.add(yearData);

        return new MathInputRatingClassA(
                yearlyData
        );
    }
}
