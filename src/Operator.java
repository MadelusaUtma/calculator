package com.endava.taa.day06;

public enum Operator {

    ADD("\\+"),
    SUBTRACT("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/"),
    PARANTHESES("(", ")" );

    private String sign;
    private String startSign;
    private String endSign;

    private Operator(String sign){
        this.sign = sign;
    }

    private Operator(String startSign, String endSign) {

        this.startSign = startSign;
        this.endSign = endSign;
    }

    public String getSign() {
        return sign;
    }
    public static Operator[] getValues(){
        return new Operator[]{
                PARANTHESES, ADD, SUBTRACT, MULTIPLY, DIVIDE
        };
    }


    public String getStartSign() {
        return startSign;
    }

    public String getEndSign() {
        return endSign;
    }
}
