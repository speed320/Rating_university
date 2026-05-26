package ru.ystu.math.core.model.input.groups.vgroups;

import java.util.List;

/**
 *
 * @param od Объем всех поступлений образовательной организации из всех источников в k-ом году (ОДk)
 * @param pn Приведенный контингент студентов образовательной организации, по данным k-го года (ПНk)
 * @param n Число лет, за которые имеются отчетные данные (n)
 */
public record MathRatingGroupV44(
        List<Double> od,
        List<Double> pn,
        Integer n
) {
}
