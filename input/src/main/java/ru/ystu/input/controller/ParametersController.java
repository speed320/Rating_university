package ru.ystu.input.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ystu.input.dto.NameRoles;
import ru.ystu.input.dto.input.InputParamDto;
import ru.ystu.input.service.ParametersService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/parameters")
public class ParametersController {
    private final ParametersService parametersService;

    public ParametersController(ParametersService parametersService) {
        this.parametersService = parametersService;
    }

    @PostMapping("/calculate")
    public ResponseEntity calculate(@RequestBody InputParamDto inputDto,
                                    @RequestHeader("X-User-Id") Long userId,
                                    @RequestHeader("X-User-Roles") List<NameRoles> roles) {

        return ResponseEntity.accepted().body(parametersService.saveAndSend(inputDto, userId, roles));
    }

    @GetMapping("/batches")
    public ResponseEntity<List<UUID>> getUserBatches(@RequestHeader("X-User-Id") Long userId,
                                              @RequestParam(defaultValue = "0") int page,
                                              @RequestParam(defaultValue = "10") int size) {

        return ResponseEntity.ok(parametersService.getUserBatchIds(userId, page, size));
    }
}
