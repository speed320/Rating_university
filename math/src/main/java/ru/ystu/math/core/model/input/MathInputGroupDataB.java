package ru.ystu.math.core.model.input;

import ru.ystu.math.core.model.input.groups.MathRatingGroupDi;
import ru.ystu.math.core.model.input.groups.MathRatingGroupPn;
import ru.ystu.math.core.model.input.groups.bgroups.*;

public record MathInputGroupDataB(
        GroupData<MathRatingGroupB11> b11,
        GroupData<MathRatingGroupB12> b12,
        GroupData<MathRatingGroupB13> b13,
        GroupData<MathRatingGroupB21> b21,
        GroupData<MathRatingGroupB22> b22,
        GroupData<MathRatingGroupB23> b23,
        GroupData<MathRatingGroupB24> b24,
        GroupData<MathRatingGroupB25> b25,
        GroupData<MathRatingGroupB26> b26,
        GroupData<MathRatingGroupB31> b31,
        GroupData<MathRatingGroupB32> b32,
        GroupData<MathRatingGroupB33> b33,
        GroupData<MathRatingGroupB34> b34,
        GroupData<MathRatingGroupB41> b41,
        GroupData<MathRatingGroupB42> b42,
        GroupData<MathRatingGroupB43> b43,
        GroupData<MathRatingGroupB44> b44,
        GroupData<MathRatingGroupPn> pn,
        GroupData<MathRatingGroupDi> di
) {}
