package ru.ystu.math.core.model.input.groups.agroups;

import java.util.List;

/**
 *
 * @param wl Количество публикаций в k-ом году в научных журналах,
 *          включенных  в "белый список" (WLk)
 * @param npr Численность научно-педагогических (научных) работников в k-ом году (НПРk)
 * @param n Число лет, за которые имеются отчетные данные НПРk (n)
 */
public record MathRatingGroupA31(
        List<Double> wl,
        List<Double> npr,
        Integer n
) {
}
