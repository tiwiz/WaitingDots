package pl.tajchert.sample;

import android.animation.TypeEvaluator;

public class DotsAnimationEvaluator implements TypeEvaluator<Number>{

    @Override
    public Number evaluate(float fraction, Number from, Number to) {
        return Math.max(0, Math.sin(fraction * Math.PI * 2)) * (to.floatValue() - from.floatValue());
    }
}
