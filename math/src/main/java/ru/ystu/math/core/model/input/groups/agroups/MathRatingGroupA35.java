package ru.ystu.math.core.model.input.groups.agroups;

import java.util.List;

/**
 *
 * @param od Объем всех поступлений образовательной организации из всех источников в k-ом году (ОДk)
 * @param npr Численность научно-педагогических (научных) работников в k-ом году (НПРk)
 * @param n Число лет, за которые имеются отчетные данные НПРk (n)
 */
public record MathRatingGroupA35(
        List<Double> od,
        List<Double> npr,
        Double n
) {
}
