package ru.ystu.math.core.model.input.groups.vgroups;

import java.util.List;

/**
 *
 * @param wl Количество публикаций в k-ом году в научных журналах, вклученных в "белый список" (WLk)
 * @param npr Численность науно-педагогических (научных) работников в k-ом году (НПРk)
 * @param n Число лет, за которые имеются отчетные данные (n)
 */
public record MathRatingGroupV41(
        List<Double> wl,
        List<Double> npr,
        Integer n
) {
}
