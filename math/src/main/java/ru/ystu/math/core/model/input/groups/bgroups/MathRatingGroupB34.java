package ru.ystu.math.core.model.input.groups.bgroups;

import java.util.List;

/**
 *
 * @param k Количество лет, за которые имеются отчетные данные (k)
 * @param hp Итоговый индекс организвации по области образования, в которую входит УГСН (НПС),
 *          в k-ом году в национальном рейтинге образовательных организаций высшего образования и
 *          профессиональных образовательных организаций (HP)
 */
public record MathRatingGroupB34(
        Integer k,
        List<Double> hp
) {
}
