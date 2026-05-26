package ru.ystu.math.core;

import ru.ystu.math.cache.MathConstantCache;
import ru.ystu.math.core.model.NameGroups;
import ru.ystu.math.core.model.input.GroupData;
import ru.ystu.math.core.model.input.groups.MathRatingGroupDi;
import ru.ystu.math.core.model.input.groups.MathRatingGroupPn;

import java.util.function.Function;

import static ru.ystu.math.core.Normalizer.normalize;
import static ru.ystu.math.core.utils.MathUtils.isZero;
import static ru.ystu.math.core.utils.MathUtils.round;

public abstract class CalculatedClass{
    private final MathConstantCache constantCache;

    protected CalculatedClass(MathConstantCache constantCache) {
        this.constantCache = constantCache;
    }

    protected <T> Double calculateGroup(GroupData<T> input, NameGroups nameGroups, Function<T, Double> indicatorCalculator){
        if(input == null) {
            return 0.0;
        }

        if(input.isResult()) {
            return round(input.resultGroup());
        }

        Double indicatorValue = indicatorCalculator.apply(input.paramData());
        var constant = constantCache.getConstant(nameGroups);
        Double normalized = normalize(indicatorValue, constant.getMinParam(), constant.getMaxParam());

        return round(normalized * constant.getWeightParam());
    }

    protected Double calculatePn(GroupData<MathRatingGroupPn> inputPn) {
        if(inputPn == null){
            return 0.0;
        }

        if (inputPn.isResult()) {
            return inputPn.resultGroup();
        }

        double pno = inputPn.paramData().pno();
        double pnv = inputPn.paramData().pnv();
        double pnz = inputPn.paramData().pnz();


        return 1.0 * pno + 0.25 * pnv + 0.1 * pnz;
    }

    protected Double calculateDi(GroupData<MathRatingGroupDi> inputDi) {
        if(inputDi == null){
            return 0.0;
        }

        if (inputDi.isResult()) {
            return inputDi.resultGroup();
        }

        double dio = inputDi.paramData().dio();
        double div = inputDi.paramData().div();
        double diz = inputDi.paramData().diz();

        return 1.0 * dio + 0.25 * div + 0.1 * diz;
    }

    protected Double calculateKi(Double pn, Double di) {
        if (isZero(pn)) {
            return 0.0;
        }
        double ki = 1 + 0.5 * (((di / pn) - 0.2) / 0.8);
        return ki >= 1.0 ? ki : 1.0;
    }
}
