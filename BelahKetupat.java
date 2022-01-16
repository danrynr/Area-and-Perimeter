package com.dicoding.javafundamental.bangundatar;

public class BelahKetupat implements BangunDatar {
    BelahKetupat() {}

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double luas1(int d1, int d2) {
        return (0.5 * d1 * d2);
    }

    @Override
    public double keliling(int s1, int s2) {return 0;}

    public double keliling1(int s5) {
        return (s5 * 4);
    }
}
