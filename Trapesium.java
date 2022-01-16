package com.dicoding.javafundamental.bangundatar;

public class Trapesium implements BangunDatar {
    Trapesium() {}

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double luas1(int d1, int d2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    public double luas(int s1, int s2, int t) {
        return (0.5 * ((s1 + s2) * t));
    }

    public double keliling(int s1, int s2, int s3, int s4) {
        return (s1 + s2 + s3 + s4);
    }
}
