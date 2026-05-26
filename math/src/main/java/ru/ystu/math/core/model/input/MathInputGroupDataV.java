package ru.ystu.math.core.model.input;

import ru.ystu.math.core.model.input.groups.MathRatingGroupDi;
import ru.ystu.math.core.model.input.groups.MathRatingGroupPn;
import ru.ystu.math.core.model.input.groups.vgroups.*;

public record MathInputGroupDataV(
        GroupData<MathRatingGroupV11> v11,
        GroupData<MathRatingGroupV12> v12,
        GroupData<MathRatingGroupV13> v13,
        GroupData<MathRatingGroupV14> v14,
        GroupData<MathRatingGroupV21> v21,
        GroupData<MathRatingGroupV22> v22,
        GroupData<MathRatingGroupV23> v23,
        GroupData<MathRatingGroupV24> v24,
        GroupData<MathRatingGroupV25> v25,
        GroupData<MathRatingGroupV26> v26,
        GroupData<MathRatingGroupV27> v27,
        GroupData<MathRatingGroupV31> v31,
        GroupData<MathRatingGroupV32> v32,
        GroupData<MathRatingGroupV33> v33,
        GroupData<MathRatingGroupV41> v41,
        GroupData<MathRatingGroupV42> v42,
        GroupData<MathRatingGroupV43> v43,
        GroupData<MathRatingGroupV44> v44,
        GroupData<MathRatingGroupPn> pn,
        GroupData<MathRatingGroupDi> di
) {
}
