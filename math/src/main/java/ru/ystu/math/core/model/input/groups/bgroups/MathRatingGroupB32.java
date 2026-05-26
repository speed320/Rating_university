package ru.ystu.math.core.model.input.groups.bgroups;

/**
 *
 * @param n Численность обучающихся по данным очетного года (N)
 * @param vo Численность выпуска обучающихся по данным отчетного года (VO)
 * @param po Численность принятых на обучения по данным отчетного года (PO)
 * @param npr Численность обучающихся по данным предшествующего отчетному году (Npr)
 */
public record MathRatingGroupB32(
        Double n,
        Double vo,
        Double po,
        Double npr
) {
}
