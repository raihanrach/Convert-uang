package com.example.convertuang.models;

public class ConvertUang {
    private int dollar ;
    private int rupiah ;
    private int total;

    public ConvertUang( int dollar, int rupiah, int total) {
        this.dollar = dollar;
        this.rupiah = rupiah;
        this.total = total;
    }

    public ConvertUang() {

    }

    public int getDollar() {

        return dollar;
    }

    public void setDollar(int dollar) {

        this.dollar = dollar;
    }

    public int getRupiah() {

        return rupiah;
    }

    public void setRupiah(int rupiah) {

        this.rupiah = rupiah;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
