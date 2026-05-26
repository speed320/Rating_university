package ru.ystu.math.core.model.input.groups.agroups;

/**
 *
 * @param cz Численность обучавшихся по договорам о целевом обучении,
 *           закончивших обучение с защитой диссертации (ЦЗ)
 * @param cv Численность обучавшихся по договорам о целевом обучении,
 *          закончивших обучение (ЦВ)
 */
public record MathRatingGroupA23(
        Double cz,
        Double cv
) {
}
