package ru.ystu.math.core.model.input.groups.bgroups;

import java.util.List;

/**
 *
 * @param k Количество лет за которые имеются отчетные данные (k)
 * @param chpsi Число программ бакалавриата, реализуемых с использование сетевой формы в i-ой обрызовательно организации (ЧПСi)
 * @param chpi Число реализуемых образовательных программ бакалавриата в i-ой образовательно организации (ЧПi)
 */
public record MathRatingGroupB25(
        Integer k,
        List<Double>chpsi,
        List<Double>chpi
) {
}
