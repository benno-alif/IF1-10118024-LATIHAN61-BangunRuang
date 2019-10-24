package com.benno;

public class Bola extends BangunRuang {

    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public Double hitungVolume() {
        return (4 * Math.PI * r * r * r) / 3;
    }
}
