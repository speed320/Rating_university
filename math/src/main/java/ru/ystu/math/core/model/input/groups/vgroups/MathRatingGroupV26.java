package ru.ystu.math.core.model.input.groups.vgroups;

import java.util.List;

/**
 *
 * @param chpsi Число программ магистратуры,
 *            реализуемых с использованием сетевой формы в i-ой образовательной организации (ЧПСi)
 * @param chpi Число реализуемых образовательных программ магистратуры в i-ой образовательной организации (ЧПi)
 * @param k Количество лет, за которые имеются отчетные данные (k)
 */
public record MathRatingGroupV26(
      List<Double> chpsi,
      List<Double> chpi,
      Integer k
) {
}
