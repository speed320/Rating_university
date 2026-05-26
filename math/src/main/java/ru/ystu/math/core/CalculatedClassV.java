package ru.ystu.math.core;

import org.springframework.stereotype.Component;
import ru.ystu.math.cache.MathConstantCache;
import ru.ystu.math.core.model.NameGroups;
import ru.ystu.math.core.model.input.MathInputClassVYearData;
import ru.ystu.math.core.model.input.MathInputGroupDataV;
import ru.ystu.math.core.model.input.MathInputRatingClassV;
import ru.ystu.math.core.model.input.groups.vgroups.*;
import ru.ystu.math.core.model.output.MathOutputClassVYearData;
import ru.ystu.math.core.model.output.MathOutputGroupDataV;
import ru.ystu.math.core.model.output.MathOutputRatingClassV;

import java.util.ArrayList;
import java.util.List;

import static ru.ystu.math.core.utils.MathUtils.*;

@Component
public class CalculatedClassV extends CalculatedClass {

    public CalculatedClassV(MathConstantCache mathConstantCache) {super(mathConstantCache);}

    public MathOutputRatingClassV calculateClass(MathInputRatingClassV mathInputRatingClassV) {
        List<MathOutputClassVYearData> yearlyData = new ArrayList<>();

        for (MathInputClassVYearData yearData : mathInputRatingClassV.yearlyData()){
            MathOutputClassVYearData classVYearData = new MathOutputClassVYearData(
                    yearData.year(),
                    calculateGroup(yearData.groups())
            );
            yearlyData.add(classVYearData);
        }

        return new MathOutputRatingClassV(
                yearlyData
        );
    }

    private MathOutputGroupDataV calculateGroup(MathInputGroupDataV mathInputRatingClassV) {
        Double v11 = calculateGroup(mathInputRatingClassV.v11(), NameGroups.V11, this::calculateV11o);
        Double v12 = calculateGroup(mathInputRatingClassV.v12(), NameGroups.V12, this::calculateV12o);
        Double v13 = calculateGroup(mathInputRatingClassV.v13(), NameGroups.V13, this::calculateV13o);
        Double v14 = calculateGroup(mathInputRatingClassV.v14(), NameGroups.V14, this::calculateV14o);
        Double v21 = calculateGroup(mathInputRatingClassV.v21(), NameGroups.V21, this::calculateV21o);
        Double v22 = calculateGroup(mathInputRatingClassV.v22(), NameGroups.V22, this::calculateV22o);
        Double v23 = calculateGroup(mathInputRatingClassV.v23(), NameGroups.V23, this::calculateV23o);
        Double v24 = calculateGroup(mathInputRatingClassV.v24(), NameGroups.V24, this::calculateV24o);
        Double v25 = calculateGroup(mathInputRatingClassV.v25(), NameGroups.V25, this::calculateV25o);
        Double v26 = calculateGroup(mathInputRatingClassV.v26(), NameGroups.V26, this::calculateV26o);
        Double v27 = calculateGroup(mathInputRatingClassV.v27(), NameGroups.V27, this::calculateV27o);
        Double v31 = calculateGroup(mathInputRatingClassV.v31(), NameGroups.V31, this::calculateV31o);
        Double v32 = calculateGroup(mathInputRatingClassV.v32(), NameGroups.V32, this::calculateV32o);
        Double v33 = calculateGroup(mathInputRatingClassV.v33(), NameGroups.V33, this::calculateV33o);
        Double v41 = calculateGroup(mathInputRatingClassV.v41(), NameGroups.V41, this::calculateV41o);
        Double v42 = calculateGroup(mathInputRatingClassV.v42(), NameGroups.V42, this::calculateV42o);
        Double v43 = calculateGroup(mathInputRatingClassV.v43(), NameGroups.V43, this::calculateV43o);
        Double v44 = calculateGroup(mathInputRatingClassV.v44(), NameGroups.V44, this::calculateV44o);
        Double pn = calculatePn(mathInputRatingClassV.pn());
        Double di = calculateDi(mathInputRatingClassV.di());
        Double ki = calculateKi(pn, di);
        Double sumGroups = v11 + v12 + v13 + v14
                + v21 + v22 + v23 + v24 + v25 + v26 + v27
                + v31 + v32 + v33 +
                v41 + v42 + v43 + v44;
        Double rating = sumGroups * ki;

        return new MathOutputGroupDataV(
                v11, v12, v13, v14,
                v21, v22, v23, v24, v25, v26, v27,
                v31, v32, v33,
                v41, v42, v43, v44,
                pn, di, ki,
                rating);
    }

    private Double calculateV11o(MathRatingGroupV11 inputV11){
        double zmd = nz(inputV11.zmd());
        double zm = nz(inputV11.zm());

        if(isZero(zm)){
            return 0.0;
        }

        return (zmd / zm) * 100;
    }

    private Double calculateV12o(MathRatingGroupV12 inputV12){
        double chz = nz(inputV12.chz());
        double zpk = nz(inputV12.zpk());

        if(isZero(zpk)){
            return 0.0;
        }

        return chz / zpk;
    }

    private Double calculateV13o(MathRatingGroupV13 inputV13){
        double mdp = nz(inputV13.mdp());
        double zpk = nz(inputV13.zpk());

        if(isZero(zpk)){
            return 0.0;
        }

        return mdp / zpk;
    }

    private Double calculateV14o(MathRatingGroupV14 inputV14){
        double prf = nz(inputV14.prf());
        double kco = nz(inputV14.kco());

        if(isZero(kco)){
            return 0.0;
        }

        return (prf / kco) * 100;
    }

    private Double calculateV21o(MathRatingGroupV21 inputV21){
        double countNpsHavingPoa = nz(inputV21.countNpsHavingPoa());
        double countLicenseNps = nz(inputV21.countLicenseNps());

        if(isZero(countLicenseNps)){
            return 0.0;
        }

        return countNpsHavingPoa / countLicenseNps;
    }

    private Double calculateV22o(MathRatingGroupV22 inputV22){
        double acp = nz(inputV22.acp());
        double opc = nz(inputV22.opc());
        double acc = nz(inputV22.acc());
        double nmp = nz(inputV22.nmp());
        double numerator = acp + opc + acc;
        
        if(numerator > 0 && isZero(nmp)){
            return 1.0;
        }
        if(isZero(nmp)){
            return 0.0;
        }
        
        return numerator / nmp;
    }

    private Double calculateV23o(MathRatingGroupV23 inputV23){
        double pkp = nz(inputV23.pkp());
        double ppp = nz(inputV23.ppp());
        double np = nz(inputV23.np());
        double noa = nz(inputV23.noa());
        double denominator = np + noa;

        if(isZero(denominator) && (pkp+ppp) > 0){
            return 1.0;
        }
        if(isZero(denominator)){
            return 0.0;
        }

        return (0.25 * pkp + ppp) / denominator;
    }

    private Double calculateV24o(MathRatingGroupV24 inputV24){
        double nap = nz(inputV24.nap());
        double pn = nz(inputV24.pn());

        if(isZero(pn)){
            return 0.0;
        }

        return nap/pn;
    }

    private Double calculateV25o(MathRatingGroupV25 inputV25){
        double bp = nz(inputV25.bp());
        double cp = nz(inputV25.cp());
        double nmp = nz(inputV25.nmp());
        double numerator = bp + cp;

        if(isZero(nmp) && numerator > 0){
            return 1.0;
        }
        if(isZero(nmp)){
            return 0.0;
        }

        return numerator / nmp;
    }

    private Double calculateV26o(MathRatingGroupV26 inputV26){
        List<Double> listChpsi = nz(inputV26.chpsi());
        List<Double> listChpi = nz(inputV26.chpi());
        int k = nz(inputV26.k());

        if(isZero(k) || !isEqualSizeList(listChpsi, listChpi)){
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listChpsi.size(); i++) {
            double chpsi = listChpsi.get(i);
            double chpi = listChpi.get(i);
            if(isZero(chpi)) {
                continue;
            }
            sum += chpsi / chpi;
        }

        return (sum * 100) / k;
    }

    private Double calculateV27o(MathRatingGroupV27 inputV27){
        List<Double> listChosi = nz(inputV27.chosi());
        List<Double> listChoi = nz(inputV27.choi());
        int k = nz(inputV27.k());

        if(isZero(k) || !isEqualSizeList(listChosi, listChoi)){
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listChosi.size(); i++) {
            double chosi = listChosi.get(i);
            double choi = listChoi.get(i);
            if(isZero(choi)) {
                continue;
            }
            sum += chosi / choi;
        }

        return (sum * 100) / k;
    }

    private Double calculateV31o(MathRatingGroupV31 inputV31){
        List<Double> listDv = nz(inputV31.dv());
        List<Double> listFt = nz(inputV31.ft());
        List<Double> listPmt = nz(inputV31.pmt());
        Double cht = nz(inputV31.cht());

        if(isZero(cht)){
            return 0.0;
        }

        double sum = 0.0;

        for(int i = 0; i < listDv.size(); i++){
            double dv = listDv.get(i);
            double ft = listFt.get(i);
            double pmt = listPmt.get(i);

            if(isZero(pmt)){
                continue;
            }

            sum += (dv * ft) / cht;
        }

        return sum;
    }

    private Double calculateV32o(MathRatingGroupV32 inputV32){
        double n = nz(inputV32.n());
        double vo = nz(inputV32.vo());
        double po = nz(inputV32.po());
        double npr = nz(inputV32.npr());

        if(isZero(npr)){
            return 0.0;
        }

        return ((n + vo - po) / npr) * 100;
    }

    private Double calculateV33o(MathRatingGroupV33 inputV33){
        List<Double> listHp = nz(inputV33.hp());
        int k = nz(inputV33.k());

        if(isZero(k)){
            return 0.0;
        }

        double sum = 0.0;
        for(Double hp : listHp){
            sum += nz(hp);
        }

        return  (sum * 100) / k;
    }

    private Double calculateV41o(MathRatingGroupV41 inputV41){
        List<Double> listWl = nz(inputV41.wl());
        List<Double> listNpr = nz(inputV41.npr());
        int n = nz(inputV41.n());

        if(isZero(n) || !isEqualSizeList(listWl, listNpr)){
            return 0.0;
        }

        double sum = 0.0;

        for (int i = 0; i < listWl.size(); i++) {
            double wl = listWl.get(i);
            double npr = listNpr.get(i);

            if(isZero(npr)){
                continue;
            }

            sum += wl/npr;
        }

        return (sum / n) * 100;
    }

    private Double calculateV42o(MathRatingGroupV42 inputV42){
        List<Double> listDn = nz(inputV42.dn());
        List<Double> listNpr = nz(inputV42.npr());
        int n = nz(inputV42.n());

        if(isZero(n) || !isEqualSizeList(listDn, listNpr)){
            return 0.0;
        }

        double sum = 0.0;

        for(int i = 0; i < listDn.size(); i++){
            double dn = listDn.get(i);
            double npr = listNpr.get(i);

            if(isZero(npr)){
                continue;
            }

            sum += dn/npr;
        }

        return sum / n;
    }

    private Double calculateV43o(MathRatingGroupV43 inputV43){
        double io = nz(inputV43.io());
        double iv = nz(inputV43.iv());
        double iz = nz(inputV43.iz());
        double no = nz(inputV43.no());
        double nv = nz(inputV43.nv());
        double nz = nz(inputV43.nz());

        if(isZero(no) && isZero(nv) && isZero(nz)){
            return 0.0;
        }

        return (1 * io + 0.25 * iv + 0.1 * iz) / (1 * no + 0.25 * nv + 0.1 * nz);
    }

    private Double calculateV44o(MathRatingGroupV44 inputV44){
        List<Double> listOd = nz(inputV44.od());
        List<Double> listPn = nz(inputV44.pn());
        int n = nz(inputV44.n());

        if(isZero(n) || !isEqualSizeList(listOd, listPn)){
            return 0.0;
        }

        double sum = 0.0;

        for(int i = 0; i < listOd.size(); i++){
            double od = listOd.get(i);
            double pn = listPn.get(i);

            if(isZero(pn)){
                continue;
            }

            sum += od / pn;
        }

        return sum / n;
    }
}
