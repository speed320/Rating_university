package ru.ystu.math.core.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

public class MathUtils {
    public static double EPSILON = 1e-6;

    private MathUtils() {
        throw new UnsupportedOperationException("Это утилитный класс!");
    }

    public static boolean isZero(Integer value){
        return Math.abs(value) == 0;
    }

    public static boolean isZero(Double value){
        return Math.abs(value) < EPSILON;
    }

    public static int nz(Integer value){
        return value == null ? 0 : value;
    }

    public static double nz(Double value){
        return value == null ? 0.0 : value;
    }

    public static <T> List<T> nz(List<T> value){
        return value == null ? Collections.emptyList() : value;
    }

    public static boolean isEqualSizeList(List<Double> list1, List<Double> list2){
        return list1.size() == list2.size();
    }

    public static double round(Double value){
        if(value == null) return 0.0;
        return BigDecimal.valueOf(value).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }

}
