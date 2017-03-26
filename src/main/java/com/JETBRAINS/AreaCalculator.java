package com.JETBRAINS;

/**
 * Hello world!
 */
public class AreaCalculator {
    public static double getAreaRectangle(int x, int y) {
        return x * y;
    }

    public static double getAreaTriangle(int l, int h) {
        return 0.5 * l * h;
    }

    public static double getAreaCircle(int r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {


        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int l = Integer.parseInt(args[2]);
        int h = Integer.parseInt((args[3]));
        int r = Integer.parseInt((args[4]));
        System.out.println("Index No    :150105A");
        System.out.println("Result 1    :" + getAreaRectangle(x, y));
        System.out.println("Result 2    :" + getAreaTriangle(l, h));
        System.out.println("Result 3    :" + getAreaCircle(r));

    }
}


