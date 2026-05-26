package ru.ystu.input.dto.output.param.groups.vgroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.vgroups.V31Output;

import java.util.List;

public record VGroupOutputV31(
        String type,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt,
        Double cht
) implements V31Output, GroupOutput {
}
