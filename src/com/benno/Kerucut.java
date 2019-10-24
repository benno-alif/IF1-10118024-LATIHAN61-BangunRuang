package com.benno;

public class Kerucut extends BangunRuang {

    private int r, h;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public Double hitungVolume() {
        return (Math.PI * r * r * h) / 3;
    }
}
