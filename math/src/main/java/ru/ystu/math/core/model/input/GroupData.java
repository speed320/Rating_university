package ru.ystu.math.core.model.input;

public record GroupData<T>(
        boolean isResult,
        Double resultGroup,
        T paramData
) {
    public static <T> GroupData<T> override(Double result) {
        return new GroupData<>(true, result, null);
    }

    public static <T> GroupData<T> override(T paramData) {
        return new GroupData<>(false, null, paramData);
    }
}
