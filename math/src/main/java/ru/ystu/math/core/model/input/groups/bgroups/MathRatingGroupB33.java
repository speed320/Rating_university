package ru.ystu.math.core.model.input.groups.bgroups;

import java.util.List;

/**
 *
 * @param cht Сумма значений показателя ФТk,r по всем субъектам РФ за три гоза, за которые имеются данные о доходах (ЧТ)
 * @param dv Среднемесячный размер заработной платы трудоустроенных выпускников (по субъектам РФ) (ДВk,r)
 * @param ft Число трудоустроенных выпускников (по сбъектам РФ) (ФТk,r)
 * @param pmt Величина прожиточного минимума трудоспособного населения (по субъектам РФ) (ПМТk,r)
 */
public record MathRatingGroupB33(
        Double cht,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt
) {
}
