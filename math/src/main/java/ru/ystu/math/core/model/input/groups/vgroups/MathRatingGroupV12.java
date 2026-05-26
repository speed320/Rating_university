package ru.ystu.math.core.model.input.groups.vgroups;

/**
 *
 * @param chz Число абитуриентов, подавших в xxxx году заявления на поступление на очную форму обучения (ЧЗ)
 * @param zpk Всего абитуриентов, принятых в xxxx году на обучение на 1 курс
 *           (за счет всех источников финнсирования, очная форма обучения) (ЗПК)
 */
public record MathRatingGroupV12(
        Double chz,
        Double zpk
) {
}
