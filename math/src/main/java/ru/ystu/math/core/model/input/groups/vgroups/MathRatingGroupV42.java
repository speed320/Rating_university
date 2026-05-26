package ru.ystu.math.core.model.input.groups.vgroups;

import java.util.List;

/**
 *
 * @param dn Объкм поступлений от выполнения НИОКР в k-ом году (ДНk)
 * @param npr Численность научно-педагогических (научных) работников в k-ом году (НПРk)
 * @param n Число лет, за которые имеются отчетные данные (n)
 */
public record MathRatingGroupV42(
        List<Double> dn,
        List<Double> npr,
        Integer n
) {
}
