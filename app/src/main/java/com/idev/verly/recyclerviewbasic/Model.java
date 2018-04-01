package com.idev.verly.recyclerviewbasic;

public class Model {

    private String nama,kelas,usia;

    public Model(String nama, String kelas, String usia) {
        this.nama = nama;
        this.kelas = kelas;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }
}
