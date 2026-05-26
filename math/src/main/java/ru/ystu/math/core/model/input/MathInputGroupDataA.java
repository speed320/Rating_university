package ru.ystu.math.core.model.input;

import ru.ystu.math.core.model.input.groups.agroups.*;
import ru.ystu.math.core.model.input.groups.MathRatingGroupDi;
import ru.ystu.math.core.model.input.groups.MathRatingGroupPn;

public record MathInputGroupDataA(
        GroupData<MathRatingGroupA11> a11,
        GroupData<MathRatingGroupA21> a21,
        GroupData<MathRatingGroupA22> a22,
        GroupData<MathRatingGroupA23> a23,
        GroupData<MathRatingGroupA31> a31,
        GroupData<MathRatingGroupA32> a32,
        GroupData<MathRatingGroupA33> a33,
        GroupData<MathRatingGroupA34> a34,
        GroupData<MathRatingGroupA35> a35,
        GroupData<MathRatingGroupA36> a36,
        GroupData<MathRatingGroupA37> a37,
        GroupData<MathRatingGroupPn> pn,
        GroupData<MathRatingGroupDi> di
) {
}
