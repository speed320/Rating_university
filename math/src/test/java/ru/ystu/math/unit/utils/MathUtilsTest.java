package ru.ystu.math.unit.utils;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.ystu.math.core.utils.MathUtils.*;

public class MathUtilsTest {

    @Test
    void isZero_shouldReturnTrueWhenZero() {
        Double input = 0.0;
        assertThat(isZero(input)).isTrue();
    }

    @Test
    void isZero_shouldReturnFalseWhenOne() {
        Double input = 1.0;
        assertThat(isZero(input)).isFalse();
    }

    @Test
    void nzInteger_shouldReturnZeroWhenNzNull(){
        Integer input = null;
        assertThat(nz(input)).isEqualTo(0);
    }

    @Test
    void nzInteger_shouldReturnValue(){
        Integer input = 5;
        assertThat(nz(input)).isEqualTo(input);
    }

    @Test
    void nzDouble_shouldReturnZeroWhenNull(){
        Double input = null;
        assertThat(nz(input)).isEqualTo(0.0);
    }

    @Test
    void nzDouble_shouldReturnValue(){
        Double input = 1.123;
        assertThat(nz(input)).isEqualTo(input);
    }

    @Test
    void nzList_shouldReturnZeroWhenNull(){
        List<Double> input = null;
        assertThat(nz(input)).isEqualTo(Collections.emptyList());
    }

    @Test
    void nzList_shouldReturnValue(){
        List<Double> input = List.of(1.0, 2.0, 3.0);
        assertThat(nz(input)).isEqualTo(input);
    }

    @Test
    void isEqualSizeList_shouldReturnFalseWhenNotEqualSizeList(){
        List<Double> list1 = List.of(1.0, 2.0, 3.0);
        List<Double> list2 = List.of(1.0, 3.0);
        assertThat(isEqualSizeList(list1, list2)).isFalse();
    }

    @Test
    void isEqualSizeList_shouldReturnTrueWhenEqualSizeList(){
        List<Double> list1 = List.of(1.0, 2.0, 3.0);
        List<Double> list2 = List.of(1.0, 3.0, 4.0);

        assertThat(isEqualSizeList(list1, list2)).isTrue();
    }

    @Test
    void round_shouldReturnZeroWhenNull(){
        Double input = null;
        assertThat(round(input)).isEqualTo(0.0);
    }

    @Test
    void round_shouldReturnValueRoundDown(){
        Double input = 1.7351;
        assertThat(round(input)).isEqualTo(1.735);
    }

    @Test
    void round_shouldReturnValueRoundUp(){
        Double input = 1.7355;
        assertThat(round(input)).isEqualTo(1.736);
    }
}
