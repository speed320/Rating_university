package ru.ystu.math.dto.input.calc.groups.vgroups.param;

import ru.ystu.math.dto.input.calc.groups.GroupInput;
import ru.ystu.math.dto.input.calc.groups.vgroups.V31Input;

import java.util.List;

public record VGroupInputV31(
        String type,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt,
        Double cht
) implements V31Input, GroupInput {
}
