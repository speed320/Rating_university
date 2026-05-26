package ru.ystu.math.core.model.input.groups.bgroups;

/**
 *
 * @param cp Принято по цел. квоте (ЦП)
 * @param p Принято на обучение (искл. квоту иностр. граждан) (П)
 */
public record MathRatingGroupB13(
        Double cp,
        Double p
) {
}
