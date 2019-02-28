package com.endava.taa.day06;

public class TestCalculator {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculatorImpl();
        ExpertCalculator expertCalculator = new ExpertCalculatorImpl();

        Integer[] array = {1, 2, 3};

        System.out.println(expertCalculator.evaluate("2+3"));
        System.out.println(expertCalculator.evaluate("3-2"));
        System.out.println(expertCalculator.evaluate("2+3+4"));
        System.out.println(expertCalculator.evaluate("2+3*4"));
        System.out.println(expertCalculator.evaluate("(2+3)/5"));
        System.out.println(expertCalculator.evaluate("(2+3)+(3+4)"));
        //        System.out.println(basicCalculator.add(1,2,3,4));
//        System.out.println(expertCalculator.pow(2, 3));
//        System.out.println(expertCalculator.factorial(4));
//        System.out.println(expertCalculator.root(4));
//        System.out.println(basicCalculator.subtract(5,3));
//        System.out.println(basicCalculator.multiply(5,3));
//        System.out.println(basicCalculator.divide(6,3));
//        System.out.println(expertCalculator.evaluate("2*3"));
//        System.out.println(expertCalculator.evaluate("4/2"));


    }
}
