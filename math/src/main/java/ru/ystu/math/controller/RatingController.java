package ru.ystu.math.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ystu.math.dto.input.history.InputHistoryDto;
import ru.ystu.math.dto.output.calc.OutputRatingDto;
import ru.ystu.math.dto.output.history.OutputHistoryDto;
import ru.ystu.math.service.RatingService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/rating")
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/calculated")
    public OutputRatingDto getCalculatedRating(UUID batchId) {
        return ratingService.getRatingResult(batchId);
    }

    @PostMapping("/history")
    public List<OutputHistoryDto> getHistoryRating(InputHistoryDto inputHistoryDto) {
        return ratingService.getHistoryRating(inputHistoryDto);
    }
}