package ru.ystu.math.core.model.input.groups.vgroups;

/**
 *
 * @param bp Приведенный контингент студентов бакалавриата (BP)
 * @param cp Приведенный контингент студентов специалитета (CP)
 * @param nmp Приведенный контингент студентов магистратуры (NMP)
 */
public record MathRatingGroupV25(
        Double bp,
        Double cp,
        Double nmp
) {
}
