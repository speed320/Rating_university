package ru.ystu.math.core;

import org.springframework.stereotype.Component;
import ru.ystu.math.cache.MathConstantCache;
import ru.ystu.math.core.model.NameGroups;
import ru.ystu.math.core.model.input.MathInputClassBYearData;
import ru.ystu.math.core.model.input.MathInputGroupDataB;
import ru.ystu.math.core.model.input.MathInputRatingClassB;
import ru.ystu.math.core.model.input.groups.bgroups.*;
import ru.ystu.math.core.model.output.MathOutputClassBYearData;
import ru.ystu.math.core.model.output.MathOutputGroupDataB;
import ru.ystu.math.core.model.output.MathOutputRatingClassB;

import java.util.ArrayList;
import java.util.List;

import static ru.ystu.math.core.utils.MathUtils.*;

@Component
public class CalculatedClassB extends CalculatedClass {

    public CalculatedClassB(MathConstantCache mathConstantCache) {
        super(mathConstantCache);
    }

    public MathOutputRatingClassB calculateClass(MathInputRatingClassB mathInputRatingClassB) {
        List<MathOutputClassBYearData> yearlyData = new ArrayList<>();

        for (MathInputClassBYearData yearData : mathInputRatingClassB.yearlyData()) {
             MathOutputClassBYearData classBYearData = new MathOutputClassBYearData(
                     yearData.year(),
                     calculateGroup(yearData.groups())
             );
             yearlyData.add(classBYearData);
        }

        return new MathOutputRatingClassB(
                yearlyData
        );
    }

    private MathOutputGroupDataB calculateGroup(MathInputGroupDataB mathInputRatingClassB) {
        Double b11 = calculateGroup(mathInputRatingClassB.b11(), NameGroups.B11, this::calculateB11o);
        Double b12 = calculateGroup(mathInputRatingClassB.b12(), NameGroups.B12, this::calculateB12o);
        Double b13 = calculateGroup(mathInputRatingClassB.b13(), NameGroups.B13, this::calculateB13o);
        Double b21 = calculateGroup(mathInputRatingClassB.b21(), NameGroups.B21, this::calculateB21o);
        Double b22 = calculateGroup(mathInputRatingClassB.b22(), NameGroups.B22, this::calculateB22o);
        Double b23 = calculateGroup(mathInputRatingClassB.b23(), NameGroups.B23, this::calculateB23o);
        Double b24 = calculateGroup(mathInputRatingClassB.b24(), NameGroups.B24, this::calculateB24o);
        Double b25 = calculateGroup(mathInputRatingClassB.b25(), NameGroups.B25, this::calculateB25o);
        Double b26 = calculateGroup(mathInputRatingClassB.b26(), NameGroups.B26, this::calculateB26o);
        Double b31 = calculateGroup(mathInputRatingClassB.b31(), NameGroups.B31, this::calculateB31o);
        Double b32 = calculateGroup(mathInputRatingClassB.b32(), NameGroups.B32, this::calculateB32o);
        Double b33 = calculateGroup(mathInputRatingClassB.b33(), NameGroups.B33, this::calculateB33o);
        Double b34 = calculateGroup(mathInputRatingClassB.b34(), NameGroups.B34, this::calculateB34o);
        Double b41 = calculateGroup(mathInputRatingClassB.b41(), NameGroups.B41, this::calculateB41o);
        Double b42 = calculateGroup(mathInputRatingClassB.b42(), NameGroups.B42, this::calculateB42o);
        Double b43 = calculateGroup(mathInputRatingClassB.b43(), NameGroups.B43, this::calculateB43o);
        Double b44 = calculateGroup(mathInputRatingClassB.b44(), NameGroups.B44, this::calculateB44o);
        Double pn = calculatePn(mathInputRatingClassB.pn());
        Double di = calculateDi(mathInputRatingClassB.di());
        Double ki = calculateKi(pn, di);
        Double sumGroups = b11 + b12 + b13 +
                b21 + b22 + b23 + b24 + b25 + b26 +
                b31 + b32 + b33 + b34 +
                b41 + b42 + b43 + b44;
        Double rating = sumGroups * ki;

        return new MathOutputGroupDataB(
                b11, b12, b13,
                b21, b22, b23, b24, b25, b26,
                b31, b32, b33, b34,
                b41, b42, b43, b44,
                pn,
                di,
                ki,
                rating);
    }

    private Double calculateB11o(MathRatingGroupB11 inputB11) {
        double ena = nz(inputB11.ena());
        double enb = nz(inputB11.enb());
        double enc = nz(inputB11.enc());
        double eb = nz(inputB11.eb());
        double ec = nz(inputB11.ec());
        double denominator = ena + enb + enc;

        if (isZero(denominator)) {
            return 0.0;
        }

        return (ena * 100 + enb * eb + enc * ec) /
                denominator;
    }

    private Double calculateB12o(MathRatingGroupB12 inputB12) {
        double prf = nz(inputB12.prf());
        double kco = nz(inputB12.kco());

        if (isZero(kco)) {
            return 0.0;
        }

        return prf / kco * 100;
    }

    private Double calculateB13o(MathRatingGroupB13 inputB13) {
        double cp = nz(inputB13.cp());
        double p = nz(inputB13.p());

        if (isZero(p)) {
            return 0.0;
        }

        return cp / p;
    }

    private Double calculateB21o(MathRatingGroupB21 inputB21) {
        double countNpsHavingPao = nz(inputB21.countNpsHavingPoa());
        double countLicenseNps = nz(inputB21.countLicenseNps());

        if (isZero(countLicenseNps)) {
            return 0.0;
        }

        return countNpsHavingPao / countLicenseNps;
    }

    private Double calculateB22o(MathRatingGroupB22 inputB22) {
        double nmp = nz(inputB22.nmp());
        double acp = nz(inputB22.acp());
        double opc = nz(inputB22.opc());
        double acc = nz(inputB22.acc());
        double nbp = nz(inputB22.nbp());
        double sumOfIndicators = nmp + acp + opc + acc;

        if (isZero(nbp)) {
            return sumOfIndicators > EPSILON ? 1.0 : 0.0;
        }

        return (nmp + 3 * (acp + opc + acc)) / nbp;
    }

    private Double calculateB23o(MathRatingGroupB23 inputB23) {
        double pkp = nz(inputB23.pkp());
        double ppp = nz(inputB23.ppp());
        double np = nz(inputB23.np());
        double noa = nz(inputB23.noa());
        double denominator = np + noa;
        double sumOfIndicators = np + noa;

        if (isZero(denominator)) {
            return sumOfIndicators > EPSILON ? 1.0 : 0.0;
        }

        return (0.25 * pkp + ppp) / (np + noa);
    }

    private Double calculateB24o(MathRatingGroupB24 inputB24) {
        double nap = nz(inputB24.nap());
        double pn = nz(inputB24.pn());

        if (isZero(pn)) {
            return 0.0;
        }

        return nap / pn;
    }

    private Double calculateB25o(MathRatingGroupB25 inputB25) {
        int k = nz(inputB25.k());
        List<Double> listChpsi = nz(inputB25.chpsi());
        List<Double> listChpi = nz(inputB25.chpi());

        if (isZero(k) || !isEqualSizeList(listChpsi, listChpi)) {
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listChpi.size(); i++) {
            double chpsi = nz(listChpsi.get(i));
            double chpi = nz(listChpi.get(i));
            if (isZero(chpi)) {
                continue;
            }
            sum += chpsi / chpi;
        }

        return (sum * 100) / k;
    }

    private Double calculateB26o(MathRatingGroupB26 inputB26) {
        int k = nz(inputB26.k());
        List<Double> listChosi = nz(inputB26.chosi());
        List<Double> listChoi = nz(inputB26.choi());

        if (isZero(k) || !isEqualSizeList(listChosi, listChoi)) {
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listChoi.size(); i++) {
            double chosi = nz(listChosi.get(i));
            double choi = nz(listChoi.get(i));

            if (isZero(choi)) {
                continue;
            }

            sum += chosi / choi;
        }

        return (sum * 100) / inputB26.k();
    }

    private Double calculateB31o(MathRatingGroupB31 inputB31) {
        double ut = nz(inputB31.ut());
        double doCount = nz(inputB31.doCount());

        if (isZero(doCount)) {
            return 0.0;
        }

        return (ut / doCount) * 100;
    }

    private Double calculateB32o(MathRatingGroupB32 inputB32) {
        double n = nz(inputB32.n());
        double vo = nz(inputB32.vo());
        double po = nz(inputB32.po());
        double npr = nz(inputB32.npr());

        if (isZero(npr)) {
            return 0.0;
        }

        return ((n + vo - po) / npr) * 100;
    }

    private Double calculateB33o(MathRatingGroupB33 inputB33) {
        List<Double> listDv = nz(inputB33.dv());
        List<Double> listFt = nz(inputB33.ft());
        List<Double> listPmt = nz(inputB33.pmt());
        double cht = nz(inputB33.cht());

        if (isZero(cht)) {
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listPmt.size(); i++) {
            double dv = listDv.get(i);
            double ft = listFt.get(i);
            double pmt = listPmt.get(i);

            if (isZero(pmt)) {
                continue;
            }

            sum += ((dv * ft) / pmt) / cht;
        }

        return sum;
    }

    private Double calculateB34o(MathRatingGroupB34 inputB34) {
        int k = nz(inputB34.k());
        List<Double> listHp = nz(inputB34.hp());

        if (isZero(k)) {
            return 0.0;
        }

        double sum = 0.0;

        for (Double hp : listHp) {
            sum += nz(hp);
        }

        return sum / k;
    }


    private Double calculateB41o(MathRatingGroupB41 inputB41) {
        int n = nz(inputB41.n());
        List<Double> listWl = nz(inputB41.wl());
        List<Double> listNpr = nz(inputB41.npr());

        if (isZero(n) || !isEqualSizeList(listWl, listNpr)) {
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listWl.size(); i++) {
            double wl = nz(listWl.get(i));
            double npr = nz(listNpr.get(i));

            if (isZero(npr)) {
                continue;
            }

            sum += wl / npr;
        }

        return (sum / n) * 100;
    }

    private Double calculateB42o(MathRatingGroupB42 inputB42) {
        int n = nz(inputB42.n());
        List<Double> listDn = nz(inputB42.dn());
        List<Double> listNpr = nz(inputB42.npr());

        if (isZero(n) || !isEqualSizeList(listDn, listNpr)) {
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listDn.size(); i++) {
            double dn = nz(listDn.get(i));
            double npr = nz(listNpr.get(i));

            if (isZero(npr)) {
                continue;
            }

            sum += dn / npr;
        }

        return sum / n;
    }

    private Double calculateB43o(MathRatingGroupB43 inputB43) {
        double io = nz(inputB43.io());
        double iv = nz(inputB43.iv());
        double iz = nz(inputB43.iz());
        double no = nz(inputB43.no());
        double nv = nz(inputB43.nv());
        double nz = inputB43.nz();
        double denominator = 1 * no + 0.25 * nv + 0.1 * nz;

        if (isZero(denominator)) {
            return 0.0;
        }


        return ((1 * io + 0.25 * iv + 0.1 * iz) / denominator) * 100;
    }

    private Double calculateB44o(MathRatingGroupB44 inputB44) {
        int n = nz(inputB44.n());
        List<Double> listOd = nz(inputB44.od());
        List<Double> listPn = nz(inputB44.pn());

        if (isZero(n) || !isEqualSizeList(listOd, listPn)) {
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listOd.size(); i++) {
            double od = nz(listOd.get(i));
            double pn = nz(listPn.get(i));

            if (isZero(pn)) {
                continue;
            }

            sum += od / pn;
        }
        return sum / n;
    }
}
