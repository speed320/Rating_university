package ru.ystu.math.core.model.input.groups.vgroups;

/**
 *
 * @param acp Приведенный контингент аспирантуры (ACP)
 * @param opc Приведенный контингент ординатуры (OPC)
 * @param acc Приведенный контингент ассистентуры-стажировки (ACC)
 * @param nmp Приведенный контингент студентов магистратуры (NMP)
 */
public record MathRatingGroupV22(
        Double acp,
        Double opc,
        Double acc,
        Double nmp
) {
}
