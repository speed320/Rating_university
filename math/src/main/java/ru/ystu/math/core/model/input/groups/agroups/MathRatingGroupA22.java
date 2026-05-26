package ru.ystu.math.core.model.input.groups.agroups;

/**
 *
 * @param zkn Защищенных диссертаций лицами, успешно освоившими программы аспирантуры
 *           (независимо от образовательной организации, в которой была защищена диссертация)
 *           в x-x годах (ЗКН)
 * @param chpa Число лиц, приятых в аспирантуру в x-x годах (ЧПА)
 */
public record MathRatingGroupA22(
        Double zkn,
        Double chpa
) {
}
