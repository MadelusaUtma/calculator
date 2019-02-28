package com.endava.taa.day06;

/*
The application should be able to add/subtract/multiply/divide any number of integers, longs, doubles
 */

public interface BasicCalculator {

    // add
    Long add(Integer ... array);
    Long add(Long ... array);
    Double add(Double... array);

    // subtract
    Integer subtract(Integer... array);
    Long subtract(Long... array);
    Double subtract(Double... array);

    // multiply
    Long multiply(Integer... array);
    Long multiply(Long... array);
    Double multiply(Double... array);

    // divide
    Double divide(Integer... array);
    Double divide(Long... array);
    Double divide(Double... array);
}
