package ru.ystu.math.core;

import org.springframework.stereotype.Component;
import ru.ystu.math.cache.MathConstantCache;
import ru.ystu.math.core.model.NameGroups;
import ru.ystu.math.core.model.input.GroupData;
import ru.ystu.math.core.model.input.MathInputClassAYearData;
import ru.ystu.math.core.model.input.MathInputGroupDataA;
import ru.ystu.math.core.model.input.MathInputRatingClassA;
import ru.ystu.math.core.model.input.groups.agroups.*;
import ru.ystu.math.core.model.output.MathOutputClassAYearData;
import ru.ystu.math.core.model.output.MathOutputGroupDataA;
import ru.ystu.math.core.model.output.MathOutputRatingClassA;

import java.util.ArrayList;
import java.util.List;

import static ru.ystu.math.core.utils.MathUtils.*;

@Component
public class CalculatedClassA extends CalculatedClass{

    public CalculatedClassA(MathConstantCache mathConstantCache) { super(mathConstantCache);}

    public MathOutputRatingClassA calculateClass(MathInputRatingClassA mathInputRatingClassA) {
        List<MathOutputClassAYearData> yearlyData = new ArrayList<>();

        for (MathInputClassAYearData yearData : mathInputRatingClassA.yearlyData()) {
            MathOutputClassAYearData classAYearData = new MathOutputClassAYearData(
                    yearData.year(),
                    calculatedGroup(yearData.groups())
            );
            yearlyData.add(classAYearData);
        }

        return new MathOutputRatingClassA(
                yearlyData
        );
    }

    private MathOutputGroupDataA calculatedGroup(MathInputGroupDataA mathInputRatingDataA) {
        Double a11 = calculateGroup(mathInputRatingDataA.a11(), NameGroups.A11, this::calculateA11o);
        Double a21 = calculateGroup(mathInputRatingDataA.a21(), NameGroups.A21, this::calculateA21o);
        Double a22 = calculateGroup(mathInputRatingDataA.a22(), NameGroups.A22, this::calculateA22o);
        Double a23 = checkingAccessNormalizationA23(mathInputRatingDataA.a23()) ?
                calculateGroup(mathInputRatingDataA.a23(), NameGroups.A23, this::calculateA23o) : 0.560;
        Double a31 = calculateGroup(mathInputRatingDataA.a31(), NameGroups.A31, this::calculateA31o);
        Double a32 = calculateGroup(mathInputRatingDataA.a32(), NameGroups.A32, this::calculateA32o);
        Double a33 = calculateGroup(mathInputRatingDataA.a33(), NameGroups.A33, this::calculateA33o);
        Double a34 = calculateGroup(mathInputRatingDataA.a34(), NameGroups.A34, this::calculateA34o);
        Double a35 = calculateGroup(mathInputRatingDataA.a35(), NameGroups.A35, this::calculateA35o);
        Double a36 = calculateGroup(mathInputRatingDataA.a36(), NameGroups.A36, this::calculateA36o);
        Double a37 = calculateGroup(mathInputRatingDataA.a37(), NameGroups.A37, this::calculateA37o);
        Double pn = calculatePn(mathInputRatingDataA.pn());
        Double di = calculateDi(mathInputRatingDataA.di());
        Double ki = calculateKi(pn, di);
        Double sumGroups = a11 +
                a21 + a22 + a23 +
                a31 + a32 + a33 + a34 + a35 + a36 + a37;
        Double rating = sumGroups * ki;

        return new MathOutputGroupDataA(
                a11,
                a21, a22, a23,
                a31, a32, a33, a34, a35, a36, a37,
                pn, di, ki,
                rating
        );
    }

    private Double calculateA11o(MathRatingGroupA11 inputA11) {
        double prf = nz(inputA11.prf());
        double kco = nz(inputA11.kco());

        if(isZero(kco)){
            return 0.0;
        }

        return (prf / kco) * 100.0;
    }

    private Double calculateA21o(MathRatingGroupA21 inputA21) {
        double zkn = nz(inputA21.zkn());
        double chva = nz(inputA21.chva());

        if(isZero(chva)){
            return 0.0;
        }

        return (zkn / chva) * 100.0;
    }

    private Double calculateA22o(MathRatingGroupA22 inputA22) {
        double zkn = nz(inputA22.zkn());
        double chpa = nz(inputA22.chpa());

        if(isZero(chpa)){
            return 0.0;
        }

        return (zkn / chpa) * 100.0;
    }

    private Boolean checkingAccessNormalizationA23(GroupData<MathRatingGroupA23> inputDataA23) {
        if(inputDataA23 == null){
            return false;
        }
        if(inputDataA23.isResult()){
            return true;
        }
        MathRatingGroupA23 inputA23 = inputDataA23.paramData();

        double cz = nz(inputA23.cz());
        double cv = nz(inputA23.cv());

        if(cv < 5.0){
            if(isZero(cv)){
                return false;
            }
            return cz / cv >= 0.6;
        }

        return true;
    }

    private Double calculateA23o(MathRatingGroupA23 inputA23) {
        double cz = nz(inputA23.cz());
        double cv = nz(inputA23.cv());

        return (cz / cv) * 100.0;
    }

    private Double calculateA31o(MathRatingGroupA31 inputA31) {
        double n = nz(inputA31.n());
        List<Double> listWl = nz(inputA31.wl());
        List<Double> listNpr = nz(inputA31.npr());

        if(isZero(n) || !isEqualSizeList(listWl, listNpr)){
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listWl.size(); i++) {
            double wl = nz(listWl.get(i));
            double npr = nz(listNpr.get(i));

            if(isZero(npr)){
                continue;
            }

            sum += wl / npr;
        }

        return (sum / n) * 100.0;
    }

    private Double calculateA32o(MathRatingGroupA32 inputA32) {
        double n = nz(inputA32.n());
        List<Double> listDn = nz(inputA32.dn());
        List<Double> listNpr = nz(inputA32.npr());

        if(isZero(n) || !isEqualSizeList(listDn, listNpr)){
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listDn.size(); i++) {
            double dn = nz(listDn.get(i));
            double npr = nz(listNpr.get(i));

            if(isZero(npr)){
                continue;
            }

            sum += dn / npr;
        }

        return sum / n;
    }

    private Double calculateA33o(MathRatingGroupA33 inputA33) {
        double n = nz(inputA33.n());
        List<Double> listRdn = nz(inputA33.rdn());
        List<Double> listNpr = nz(inputA33.npr());

        if(isZero(n) || !isEqualSizeList(listRdn, listNpr)){
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listRdn.size(); i++) {
            double rdn = nz(listRdn.get(i));
            double npr = nz(listNpr.get(i));

            if(isZero(npr)){
                continue;
            }

            sum += rdn / npr;
        }

        return sum / n;
    }

    private Double calculateA34o(MathRatingGroupA34 inputA34) {
        double n = nz(inputA34.n());
        List<Double> listIa = nz(inputA34.ia());
        List<Double> listAsp = nz(inputA34.asp());

        if(isZero(n) || !isEqualSizeList(listIa, listAsp)){
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listIa.size(); i++) {
            double ia = nz(listIa.get(i));
            double asp = nz(listAsp.get(i));

            if(isZero(asp)){
                continue;
            }

            sum += ia / asp;
        }

        return (sum * 100.0) / n;
    }

    private Double calculateA35o(MathRatingGroupA35 inputA35) {
        double n = nz(inputA35.n());
        List<Double> listOd = nz(inputA35.od());
        List<Double> listNpr = nz(inputA35.npr());

        if(isZero(n) || !isEqualSizeList(listOd, listNpr)){
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listOd.size(); i++) {
            double od = nz(listOd.get(i));
            double npr = nz(listNpr.get(i));

            if(isZero(npr)){
                continue;
            }

            sum += od / npr;
        }

        return sum / n;
    }

    private Double calculateA36o(MathRatingGroupA36 inputA36) {
        double pfn = nz(inputA36.pfn());
        double aso = nz(inputA36.aso());

        if(isZero(aso)){
            return 0.0;
        }

        return pfn / aso;
    }

    private Double calculateA37o(MathRatingGroupA37 inputA37) {
        double ozg = nz(inputA37.ozg());

        if(ozg == 1){
            return 1.0;
        }

        return 0.0;
    }
}
