package ru.ystu.math.core.model.input.groups.bgroups;

/**
 *
 * @param nmp Приведенный контингент студентов магистратуры (при расчете по программам специалитета принимается равным нулю)(NMP)
 * @param acp Приведенный контингент аспирантуры (в силу отсутствия отчетных данных по научным специальностям формула упрощена) (ACP)
 * @param opc Стажировки по программам ординатуры (OPC)
 * @param acc Стажировки по программам аспирантуры (ACC)
 * @param nbp Приведенный контингент студентов бакалавриата(специалитета) (NBP)
 */
public record MathRatingGroupB22(
        Double nmp,
        Double acp,
        Double opc,
        Double acc,
        Double nbp
) {
}
