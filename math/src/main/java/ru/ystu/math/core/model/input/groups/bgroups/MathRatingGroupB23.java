package ru.ystu.math.core.model.input.groups.bgroups;

/**
 *
 * @param pkp Приведенный контингент обучившихся по программам повышения квалификации (ПКП)
 * @param ppp Приведенный контингент обучившихся по программам профессиональной переподготовки (ППП)
 * @param np Приведенный контингент обучающихся по программам бакалавриата и магистратуры (NP)
 * @param noa Численность обучающихся по программам ординатуры, программам ассистентуры-стажировки(NOA)
 */
public record MathRatingGroupB23(
        Double pkp,
        Double ppp,
        Double np,
        Double noa
) {
}
