package com.endava.taa.day06;

public class BasicCalculatorImpl implements BasicCalculator {
    @Override
    public Long add(Integer... array) {
        Long sum = 0L;
        for (Integer number : array) {
            sum += number; // se poate scrie si sum = sum + number;
        }
        return sum;
    }

    @Override
    public Long add(Long... array) {
        Long sum = 0L;
        for (Long number : array) {
            sum += number;
        }
        return sum;
    }

    @Override
    public Double add(Double... array) {
        Double sum = 0D;
        for (Double number : array) {
            sum += number;
        }
        return sum;
    }

    @Override
    public Integer subtract(Integer... array) {
        Integer subtract = array[0];
        if (array.length == 1) {
            return subtract;
        } else {
            for (int i = 1; i < array.length; i++) {
                subtract -= array[i];
            }
        }

        return subtract;
    }

    @Override
    public Long subtract(Long... array) {
        Long subtract = array[0];
        if (array.length == 1) {
            return subtract;
        } else {
            for (int i = 1; i < array.length; i++) {
                subtract -= array[i];
            }
        }
        return subtract;
    }

    @Override
    public Double subtract(Double... array) {
        Double subtract = array[0];
        if (array.length == 1) {
            return subtract;
        } else {
            for (int i = 1; i < array.length; i++) {
                subtract -= array[i];
            }
        }

        return subtract;
    }

    @Override
    public Long multiply(Integer... array) {
        Long multiply = 1L;
        for (Integer number : array) {
            multiply *= number;

        }
        return multiply;
    }

    @Override
    public Long multiply(Long... array) {
        Long multiply = 1L;
        for (Long number : array) {
            multiply *= number;
        }
        return multiply;
    }

    @Override
    public Double multiply(Double... array) {
        Double multiply = 1D;
        for (Double number : array) {
            multiply *= number;
        }
        return multiply;
    }

    @Override
    public Double divide(Integer... array) {
        Double divide = new Double(array[0]);
        for (int i = 1; i < array.length; i++) {
            divide /= array[i];
        }
        return divide;
    }

    @Override
    public Double divide(Long... array) {
        Double divide = new Double(array[0]);
        for (int i = 1; i < array.length; i++){
            divide /= array[i];
        }
        return divide;
    }

    @Override
    public Double divide(Double... array) {
        Double divide = array[0];
        for (int i = 1; i < array.length; i++){
            divide /= array[i];
        }
        return divide;
    }

//    @Override
//    public Long add(Long a, Long b) {
//
//        return a + b;
//    }
//
//    @Override
//    public Double add(Double a, Double b) {
//
//        return a + b;
//    }
//
//    @Override
//    public Long multiply(Integer a, Integer b) {
//        return Long.valueOf(a * b);
//    }
}
