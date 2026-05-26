package ru.ystu.math.core.model.input.groups.bgroups;

/**
 *
 * @param nap Приведенный контингент обучающихся по договорам о целевом обучении, по данным отчетного года (NAP)
 * @param pn Приведенный контингент обучающихся (PN)
 */
public record MathRatingGroupB24(
        Double nap,
        Double pn
) {
}
