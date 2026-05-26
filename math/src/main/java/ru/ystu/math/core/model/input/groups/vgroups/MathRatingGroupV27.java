package ru.ystu.math.core.model.input.groups.vgroups;

import java.util.List;

/**
 *
 * @param chosi Число обучающихся по программам магистратуры,
 *            реализуемым с использованием сетевой формы в i-ой образовательной организации (ЧОСi)
 * @param choi Число обучающихся по программам магистратуры в i-ой образовательной организации (ЧОi)
 * @param k Количество лет, за которые имеются отчетные данные (k)
 */
public record MathRatingGroupV27(
        List<Double> chosi,
        List<Double> choi,
        Integer k
) {
}
