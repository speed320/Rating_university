package ru.ystu.math.core.model.input.groups.agroups;

import java.util.List;

/**
 *
 * @param asp Общая численность обучающихся аспирантуры по данным k-го года (АСПk)
 * @param ia Численность иностранных граждан, обучающихся в вузе, по данным k-го года (ИАk)
 * @param n Число лет, за которые имеются отчетные данные АСПk (n)
 */
public record MathRatingGroupA34(
        List<Double> asp,
        List<Double> ia,
        Double n
) {
}
