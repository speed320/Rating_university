package ru.ystu.math.core.model.input.groups.bgroups;

import java.util.List;

/**
 *
 * @param k Количество лет, за которые имется отчетные данные (k)
 * @param chosi Число обучающихся по прогрпммпм бакалавриата, реализуемым с использованием сетевой формы в i-ой образовательной организации (ЧОСi)
 * @param choi Число обучающихся по программам бакалавриата в i-ой образовательной организации (ЧОi)
 */
public record MathRatingGroupB26(
        Integer k,
        List<Double> chosi,
        List<Double> choi
) {
}
