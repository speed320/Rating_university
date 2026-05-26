package ru.ystu.math.core.model.input.groups.bgroups;

import java.util.List;

/**
 *
 * @param n Число лет, за которые имется отчетные данные НПРk (n)
 * @param dn Объем поступлений от выполнения НИОКР в k-ом году (ДН)
 * @param npr Численность научно-педагогических (научных) работников в k-ом году (НПР)
 */
public record MathRatingGroupB42(
        Integer n,
        List<Double> dn,
        List<Double> npr
) {
}
