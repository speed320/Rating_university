package ru.ystu.math.core.model.input.groups.vgroups;

/**
 *
 * @param countNpsHavingPoa Количество НПС, имеющих ПАО
 * @param countLicenseNps Количество лицензированных НПС
 */
public record MathRatingGroupV21(
        Double countNpsHavingPoa,
        Double countLicenseNps
) {
}
