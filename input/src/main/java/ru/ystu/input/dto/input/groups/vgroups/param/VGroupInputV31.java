package ru.ystu.input.dto.input.groups.vgroups.param;

import ru.ystu.input.dto.input.groups.GroupInput;
import ru.ystu.input.dto.input.groups.vgroups.V31Input;

import java.util.List;

public record VGroupInputV31(
        String type,
        List<Double> dv,
        List<Double> ft,
        List<Double> pmt,
        Double cht
) implements V31Input, GroupInput {
}
