package ru.ystu.math.core;

public final class Normalizer {
    private Normalizer() {}

    public static double normalize(double indicatorValue, double minParam, double maxParam) {
        if (Double.isNaN(indicatorValue) || Double.isInfinite(indicatorValue)) return 0.0;
        if (indicatorValue <= minParam) return 0.0;
        if (indicatorValue >= maxParam) return 1.0;
        return (indicatorValue - minParam) / (maxParam - minParam);
    }
}
