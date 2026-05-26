package ru.ystu.input.dto.output.param.groups.agroups.param;

import ru.ystu.input.dto.output.param.groups.GroupOutput;
import ru.ystu.input.dto.output.param.groups.agroups.A35Output;

import java.util.List;

public record AGroupOutputA35(
        String type,
        List<Double> od,
        List<Double> npr,
        Double n
) implements A35Output, GroupOutput {
}
