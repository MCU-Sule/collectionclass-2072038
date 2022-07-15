package com.pterapan.collectiondemo.Model;

public class Student {
    private String nrp;
    private String nama;

    @Override
    public String toString() {
        return nrp + " - " + nama;
    }

    public Student(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
