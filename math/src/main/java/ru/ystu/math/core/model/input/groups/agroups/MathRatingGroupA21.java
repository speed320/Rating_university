package ru.ystu.math.core.model.input.groups.agroups;

/**
 *
 * @param zkn Защищенных диссертаций лицами, успешно освоившими программы аспирантуры
 *            (независимо от образовательной организации, в которой была защищена диссертация) (ЗКН)
 * @param chva Число выпускников аспирантуры (ЧВА)
 */
public record MathRatingGroupA21(
        Double zkn,
        Double chva
) {
}
