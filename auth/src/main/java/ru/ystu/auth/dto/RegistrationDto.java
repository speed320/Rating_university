package ru.ystu.auth.dto;

public record RegistrationDto(
        String username,
        String password,
        String email
) {
}
