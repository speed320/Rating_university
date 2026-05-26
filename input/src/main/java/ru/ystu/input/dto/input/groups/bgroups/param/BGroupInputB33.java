package ru.ystu.input.dto.input.groups.bgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.bgroups.B33Input;

import java.util.List;

public record BGroupInputB33(
        String type,
        Double cht,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt
) implements B33Input, GroupInput {
}
