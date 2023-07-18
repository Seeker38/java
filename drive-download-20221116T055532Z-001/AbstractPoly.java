package com.oop.Poly;

public abstract class AbstractPoly implements Poly{
    private int degree;
    public AbstractPoly() {
    }

    @Override
    public int degree() {
        return coefficients().length - 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof AbstractPoly abstractPoly)) return false;
        if (abstractPoly.degree() != degree()) return false;
        for (int i = 0; i < degree(); i++) {
            if (coefficient(i) != abstractPoly.coefficient(i)) return false;
        }
        return true;
    }

    @Override
    public double evaluate(double x) {
        double eval = 0;
        for (int i = 0; i < degree(); i++) eval += coefficient(i) * Math.pow(x, i);
        return eval;
    }

    @Override
    public String toString() {
        String s = "Poly[";
        int i = 0;
        while (i <= degree()) {
            if (coefficient(i) == 0) continue;
            switch (i) {
                case 0 -> s += coefficient(i);
                case 1 -> s += "+" + coefficient(i) + "x";
                default -> s += "+" + coefficient(i) + "x^" + i;
            }
            i++;
        }
        s += "]";
        return s;
    }

    public int[] differentiate() {
        if (degree() == 0) return new int[] {0};

        int[] diff = new int[degree()];
        for (int i = 0; i < degree(); i++) diff[i] = coefficient(i + 1) * (i + 1);
        return diff;
    }
}
