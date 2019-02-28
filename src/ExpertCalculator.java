package com.endava.taa.day06;

public interface ExpertCalculator extends BasicCalculator{

    Long pow(Integer x, Integer n);
    Double root(Integer x);
    Long factorial(Integer n);
    Double evaluate(String expression);

}
