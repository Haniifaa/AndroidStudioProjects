package com.example.uts_13820;

public class MenuModel {
    String namabarang;
    String kodebarang;
    String hargabarang;
    String satuanbarang;
    int gambarbarang;


    public MenuModel(String namabarang, String kodebarang, String hargabarang, String satuanbarang, int gambarbarang) {
        this.namabarang = namabarang;
        this.kodebarang = kodebarang;
        this.hargabarang = hargabarang;
        this.satuanbarang = satuanbarang;
        this.gambarbarang = gambarbarang;

    }


    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getHargabarang() {
        return hargabarang;
    }

    public void setHargabarang(String hargabarang) {
        this.hargabarang = hargabarang;
    }

    public String getSatuanbarang() {
        return satuanbarang;
    }

    public void setSatuanbarang(String satuanbarang) {
        this.satuanbarang = satuanbarang;
    }

    public int getGambarbarang() {
        return gambarbarang;
    }

    public void setGambarbarang(int gambarbarang) {
        this.gambarbarang = gambarbarang;
    }


}
