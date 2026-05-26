package ru.ystu.math.core;

import org.springframework.stereotype.Component;
import ru.ystu.math.core.model.input.MathInputRating;
import ru.ystu.math.core.model.output.MathOutputRating;
import ru.ystu.math.core.model.output.MathOutputRatingClassA;
import ru.ystu.math.core.model.output.MathOutputRatingClassB;
import ru.ystu.math.core.model.output.MathOutputRatingClassV;

@Component
public class RatingCore {
    private final CalculatedClassA calculatedClassA;
    private final CalculatedClassB calculatedClassB;
    private final CalculatedClassV calculatedClassV;

    public RatingCore(CalculatedClassA calculatedClassA, CalculatedClassB calculatedClassB, CalculatedClassV calculatedClassV) {
        this.calculatedClassA = calculatedClassA;
        this.calculatedClassB = calculatedClassB;
        this.calculatedClassV = calculatedClassV;
    }

    public MathOutputRating calculateRating(MathInputRating inputRating) {

        MathOutputRatingClassA ratingClassA = calculatedClassA.calculateClass(inputRating.mathInputRatingClassA());
        MathOutputRatingClassB ratingClassB =  calculatedClassB.calculateClass(inputRating.mathInputRatingClassB());
        MathOutputRatingClassV ratingClassV = calculatedClassV.calculateClass(inputRating.mathInputRatingClassV());


        return new MathOutputRating(ratingClassA, ratingClassB, ratingClassV);
    }
}
