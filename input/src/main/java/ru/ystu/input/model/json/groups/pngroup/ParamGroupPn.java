package ru.ystu.input.model.json.groups.pngroup;

import ru.ystu.input.model.json.groups.ParamGroup;

import java.io.Serializable;

public record ParamGroupPn(
        String type,
        Double pno,
        Double pnv,
        Double pnz
) implements ParamGroup, ParamPn, Serializable {
}
