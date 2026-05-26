package ru.ystu.math.core.model.input.groups.agroups;

import java.util.List;

/**
 *
 * @param rdn Объем поступлений от выполнения НИОКР в k-ом году
 *            (кроме средств бюджетов бюджетной системы РФ,
 *            государственных фондов поддержки научной,
 *            научно-технической и инновационной деятельности) (РДНk)
 * @param npr Численность научно-педагогических (научных) работников в k-ом году (НПРk)
 * @param n Число лет, за которые имеются отчетные данные НПРk (n)
 */
public record MathRatingGroupA33(
        List<Double> rdn,
        List<Double> npr,
        Integer n
) {
}
