package ru.ystu.math.dto.input.calc.groups.bgroups.param;

import ru.ystu.math.dto.input.calc.groups.bgroups.B33Input;
import ru.ystu.math.dto.input.calc.groups.GroupInput;

import java.util.List;

public record BGroupInputB33(
        String type,
        Double cht,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt
) implements B33Input, GroupInput {
}
