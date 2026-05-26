package ru.ystu.math.core.model.output;

import java.util.List;

public record MathOutputRatingClassV(
        List<MathOutputClassVYearData> yearlyData
) {
}
