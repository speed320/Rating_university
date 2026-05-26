package ru.ystu.math.core.model.input.groups.vgroups;

/**
 *
 * @param n Численность обучающихся по данным отчетного года (N)
 * @param vo Численность выпуска обучающихся по данным отчетного года (VO)
 * @param po Численность принятых на обучение по данным отчетного года (PO)
 * @param npr Численность обучающихся по данным года, предшествующего отчетному (Npr)
 */
public record MathRatingGroupV32(
        Double n,
        Double vo,
        Double po,
        Double npr
) {
}
