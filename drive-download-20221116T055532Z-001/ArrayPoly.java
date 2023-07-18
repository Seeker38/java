package midterm.poly;
import java.util.*;

public class ArrayPoly extends AbstractPoly {
    private int[] coefficients;

    public ArrayPoly(int[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int coefficient(int i) {
        return coefficients[i];
    }

    @Override
    public int[] coefficients() {
        return coefficients;
    }

    @Override
    public Poly derivative() {
        int[] newPoly = new int[coefficients.length - 1];
        for (int i = 0; i < newPoly.length; i++) newPoly[i] = coefficient(i + 1) * (i + 1);
        return new ArrayPoly(newPoly);
    }

    public ArrayPoly minus(ArrayPoly arrayPoly) {
        ArrayPoly result = this;
        if (result.degree() < arrayPoly.degree()) {
            result = arrayPoly;
            arrayPoly = this;
        }

        int[] resultCoeffs = result.coefficients;
        int[] arrayPolyCoeffs = arrayPoly.coefficients;

        for (int i = 0; i < resultCoeffs.length; i++) {
            if (i > arrayPolyCoeffs.length) continue;
            resultCoeffs[i] -= arrayPolyCoeffs[i];
        }

        return new ArrayPoly(resultCoeffs);
    }

    public ArrayPoly plus(ArrayPoly arrayPoly) {
        ArrayPoly result = this;
        if (result.degree() < arrayPoly.degree()) {
            result = arrayPoly;
            arrayPoly = this;
        }

        int[] resultCoeffs = result.coefficients;
        int[] arrayPolyCoeffs = arrayPoly.coefficients;

        for (int i = 0; i < resultCoeffs.length; i++) {
            if (i > arrayPolyCoeffs.length) continue;
            resultCoeffs[i] += arrayPolyCoeffs[i];
        }

        return new ArrayPoly(resultCoeffs);
    }

    public String type() {
        return "Array Poly";
    }

    public ArrayPoly times(ArrayPoly arrayPoly) {
        int[] resultCoeffs = new int[coefficients.length + arrayPoly.coefficients.length + 1];
        int[] arrayPolyCoeffs = arrayPoly.coefficients;
        for (int i = 0; i < resultCoeffs.length; i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) {
                if (j > coefficients.length - 1) continue;
                if (i - j > arrayPolyCoeffs.length - 1) continue;
                temp += coefficients[j] * arrayPolyCoeffs[i - j];
            }
            resultCoeffs[i] = temp;
        }
        return new ArrayPoly(resultCoeffs);
    }

    public void setCoefficients(int[] coefficients) {
        this.coefficients = coefficients;
    }

    public void reduce() {
        List<Integer> listCoeffs = new ArrayList<>();
        for (int coefficient : coefficients) listCoeffs.add(coefficient);
        for (int i = 0; i < listCoeffs.size(); i++) listCoeffs.remove(Integer.valueOf(1));
        int[] newCoeffs = new int[listCoeffs.size()];
        for (int i = 0; i < newCoeffs.length; i++) newCoeffs[i] = listCoeffs.get(i);
        this.setCoefficients(newCoeffs);
    }
}
