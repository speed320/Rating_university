package ru.ystu.math.core.model.input.groups.bgroups;

/**
 *
 * @param countNpsHavingPoa Количество НПС, имеющих ПАО
 * @param countLicenseNps Количество лицензированных НПС
 */
public record MathRatingGroupB21(
        Double countNpsHavingPoa,
        Double countLicenseNps
) {
}
