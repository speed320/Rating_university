package ru.ystu.math.core.model.input.groups;

/**
 *
 * @param pno Численность обучающихся по программам бакалавриата, специалитета, магистратуры очно (PNo)
 * @param pnv Численность обучающихся по программам бакалавриата, специалитета, магистратуры очно-заочно (PNv)
 * @param pnz Численность обучающихся по программам бакалавриата, специалитета, магистратуры заочно (PNz)
 */
public record MathRatingGroupPn(
        Double pno,
        Double pnv,
        Double pnz
) {
}
