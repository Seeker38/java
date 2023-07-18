package com.oop.Poly;

public interface Poly {
    int coefficient(int i);
    int[] coefficients();
    int degree();
    Poly derivative();
    double evaluate(double x);
}
