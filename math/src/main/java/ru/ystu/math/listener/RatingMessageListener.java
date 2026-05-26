package ru.ystu.math.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import ru.ystu.math.dto.input.calc.InputRatingDto;
import ru.ystu.math.service.RatingService;

@Component
public class RatingMessageListener {
    private final RatingService ratingService;

    public RatingMessageListener(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @RabbitListener(queues = "${rabbitmq.queues.calculation}")
    public void handleCalculateRatingCommand(InputRatingDto inputRatingDto) {
        ratingService.calculateAndSaveRating(inputRatingDto);
    }
}
