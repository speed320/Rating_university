package ru.ystu.math.core.model.input.groups.vgroups;

/**
 *
 * @param mdp Число абитуриентов, поступивших в xxxx году по договорам с оплатой обучения (очная форма обучения) (МДП)
 * @param zpk Всего абитуриентов, принятых в xxxx году на обучение на 1 курс (очная форма обучения) (ЗПК)
 */
public record MathRatingGroupV13(
        Double mdp,
        Double zpk
) {
}
