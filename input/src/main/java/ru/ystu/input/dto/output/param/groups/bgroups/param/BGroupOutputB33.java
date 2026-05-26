package ru.ystu.input.dto.output.param.groups.bgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.bgroups.B33Output;

import java.util.List;

public record BGroupOutputB33(
        String type,
        Double cht,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt
) implements B33Output, GroupOutput {
}
