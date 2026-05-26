package ru.ystu.math.core.model.input.groups.bgroups;

/**
 *
 * @param ena Зачислено на обучение без вступит. испытаний (ENa)
 * @param enb Зачислено на обучение с учетом ЕГЭ. общ.конкур.(ENb)
 * @param eb Средний балл ЕГЭ по общ. конкурсу (ЕГЭb)
 * @param enc Зачислено на обучение с учетом ЕГЭ по цел. квоте (ENc)
 * @param ec Средний балл ЕГЭ по цел. квоте (ЕГЭc)
 */
public record MathRatingGroupB11(
        Double ena,
        Double enb,
        Double eb,
        Double enc,
        Double ec
) {
}
