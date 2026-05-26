package ru.ystu.math.core.model.input.groups.bgroups;

import java.util.List;

/**
 *
 * @param n Число лет, за которые имеются отчетные данные PNk (n)
 * @param od Объем всех поступлений образовательной организации из всех источников в k-ом году (ОД)
 * @param pn Приведенны контингент студентов образовательной организации по данным k-ого года (PN)
 */
public record MathRatingGroupB44(
        Integer n,
        List<Double> od,
        List<Double> pn
) {
}
