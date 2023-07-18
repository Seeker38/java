package com.oop.Poly;
import java.util.*;

public class ListPoly extends AbstractPoly{
    private List<Integer> coefficients;
    public ListPoly(int[] coeffs) {
        coefficients = new ArrayList<>();
        for (int i: coeffs) coefficients.add(i);
        reduce();
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    public int coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public int[] coefficients() {
        int[] poly = new int[coefficients.size()];
        for (int i = 0; i <= poly.length; i++) poly[i] = coefficient(i);
        return poly;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(differentiate());
    }

    public ListPoly minus(ListPoly listPoly) {
        ListPoly result = this;
        if (result.degree() < listPoly.degree()) {
            result = listPoly;
            listPoly = this;
        }

        List<Integer> resultCoeffs = result.coefficients;
        List<Integer> listPolyCoeffs = listPoly.coefficients;
        for (int i = 0; i < resultCoeffs.size(); i++) {
            if (i > listPolyCoeffs.size() - 1) continue;
            resultCoeffs.set(i, resultCoeffs.get(i) - listPolyCoeffs.get(i));
        }

        int[] list = new int[resultCoeffs.size()];
        for (int i = 0; i < list.length; i++) list[i] = resultCoeffs.get(i);
        return new ListPoly(list);
    }

    public ListPoly plus(ListPoly listPoly) {
        ListPoly result = this;
        if (result.degree() < listPoly.degree()) {
            result = listPoly;
            listPoly = this;
        }

        List<Integer> resultCoeffs = result.coefficients;
        List<Integer> listPolyCoeffs = listPoly.coefficients;
        for (int i = 0; i < resultCoeffs.size(); i++) {
            if (i > listPolyCoeffs.size() - 1) continue;
            resultCoeffs.set(i, resultCoeffs.get(i) + listPolyCoeffs.get(i));
        }

        int[] list = new int[resultCoeffs.size()];
        for (int i = 0; i < list.length; i++) list[i] = resultCoeffs.get(i);
        return new ListPoly(list);
    }

    public ListPoly times(ListPoly listPoly) {
        List<Integer> resultCoeffs = new ArrayList<>();
        List<Integer> listPolyCoeffs = listPoly.coefficients;
        for (int i = 0; i < coefficients.size(); i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) {
                if (j > coefficients.size() - 1) continue;
                if (i - j > listPolyCoeffs.size() - 1) continue;
                temp += coefficients.get(j) * listPolyCoeffs.get(i - j);
            }
            resultCoeffs.add(temp);
        }
        int[] list = new int[resultCoeffs.size()];
        for (int i = 0; i < list.length; i++) list[i] = resultCoeffs.get(i);
        return new ListPoly(list);
    }

    public void reduce() {
        for (int i = 0; i < degree(); i++) {
            if (this.coefficient(i) == 0) coefficients.remove(i);
        }
    }

    public String type() {
        if (this instanceof ListPoly) return "List Poly";
        return null;
    }
}
