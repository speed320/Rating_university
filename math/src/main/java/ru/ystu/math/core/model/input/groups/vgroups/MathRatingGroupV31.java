package ru.ystu.math.core.model.input.groups.vgroups;

import java.util.List;

/**
 *
 * @param dv Среднемесячный размер заработной платы трудоустроенных выпускников (ДВ)
 * @param ft Число трудоустроенных выпускников (ФТ)
 * @param pmt Величина прожиточного минимума трудоспособного населения (ПМТ)
 * @param cht Сумма значений показателя ФТ по всем субъектам Российской Федерации за три года,
 *           за которые имеются данные о доходах (ЧТ)
 */
public record MathRatingGroupV31(
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt,
        Double cht
) {
}
