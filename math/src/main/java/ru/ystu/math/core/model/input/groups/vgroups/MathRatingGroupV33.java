package ru.ystu.math.core.model.input.groups.vgroups;

import java.util.List;

/**
 *
 * @param hp Итоговый индекс организации по области образования, в которую входит УГСН (НПС),
 *          в k-ом году в национальном рейтинге образовательных организаций высшего образования и
 *           профессиональных образовательных организаций (HP)
 * @param k Количество лет, за которые имеются отчетные данные (k)
 */
public record MathRatingGroupV33(
        List<Double> hp,
        Integer k
) {
}
