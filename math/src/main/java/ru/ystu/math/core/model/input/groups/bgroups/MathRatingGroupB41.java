package ru.ystu.math.core.model.input.groups.bgroups;

import java.util.List;

/**
 *
 * @param n Число лет, за которые имеются отчетные данные НПРk (n)
 * @param wl Количество публикаций в k-ом году в научных журналах, включенных в "белый список" (WL)
 * @param npr Численность научно-педагогических (научных) работников в k-м году (НПРk)
 */
public record MathRatingGroupB41(
        Integer n,
        List<Double> wl,
        List<Double> npr
) {
}
