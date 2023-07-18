package com.oop.Poly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestPoly {
    List<Poly> polyList;

    public TestPoly() {
        this.polyList = new ArrayList<>();
    }

    public static ArrayPoly createArrayPoly(int[] arrPoly) {
        ArrayPoly arrayPoly = new ArrayPoly(arrPoly);
        return arrayPoly;
    }

    public static ListPoly createListPoly(int[] arrPoly) {
        ListPoly listPoly = new ListPoly(arrPoly);
        return listPoly;
    }

    public static int[] createRandomArray(int degree) {

        int[] arr = new int[degree];
        Random random = new Random();
        for (int i = 0; i < degree; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 5, 2, 4, 3, 3, 2, 4, 3};
        TestPoly testPoly = new TestPoly();
        for (int i = 0; i < arr.length; i++) {
            if (i < 5) {
                testPoly.polyList.add(createListPoly(createRandomArray(arr[i])));
            } else {
                testPoly.polyList.add(createArrayPoly(createRandomArray(arr[i])));
            }
        }
        int x = 3;
        for (int i = 0; i < testPoly.polyList.size(); i++) {
            System.out.println(testPoly.polyList.get(i));
            System.out.println(testPoly.polyList.get(i).derivative());
            System.out.println(x);
            System.out.println(testPoly.polyList.get(i).evaluate(x));
        }

        ListPoly listPoly = new ListPoly(new int[]{2, 4, 6, 8});

        System.out.println(listPoly);
        System.out.println(listPoly.derivative());
        System.out.println(x);
        System.out.println(listPoly.evaluate(x));

        ArrayPoly arrayPoly = new ArrayPoly(new int[]{2, 4, 6, 8});
        System.out.println(arrayPoly);
        System.out.println(arrayPoly.derivative());

        ListPoly listPoly1 = new ListPoly(new int[]{2, 0, 3, 4, 5});
        System.out.println(listPoly1);
        System.out.println(listPoly1.derivative());
    }
}