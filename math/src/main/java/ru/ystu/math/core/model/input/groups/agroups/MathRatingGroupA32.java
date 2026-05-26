package ru.ystu.math.core.model.input.groups.agroups;

import java.util.List;

/**
 *
 * @param dn Объем поступленй от выполнения НИОКР в k-ом году (ДНk)
 * @param npr Численность научно-педагогических (научных) работников в k-ом году (НПРk)
 * @param n Число лет, за которые имеются отчетные данные НПРk (n)
 */
public record MathRatingGroupA32(
        List<Double> dn,
        List<Double> npr,
        Integer n
) {
}
