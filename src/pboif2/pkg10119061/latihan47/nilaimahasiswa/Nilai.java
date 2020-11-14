/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan47.nilaimahasiswa;

/**
 *
 * @author Rheiza
 */
class Nilai {
     private int quis,uts,uas;
    private double nilaiAkhir;

    public int getQuis() {
        return quis;
    }

    public void setQuis(int quis) {
        this.quis = quis;
    }

    public int getUts() {
        return uts;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public int getUas() {
        return uas;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public double hitungNilaiAkhir(int quis, int uts, int uas) {
        return 0.2 * quis + 0.3 * uts + 0.5 * uas;
    }
    
    public String menentukanIndex(double na) {
        String index;
        if (na >= 80 && na <= 100) {
            index = "A";
        } else if (na >=68 && na <80) {
            index = "B";
        } else if (na >=56 && na <68) {
            index = "C";
        }  else if (na >=45 && na <56) {
            index = "D";
        }  else{
            index = "E";
        }
        return index;
    }
    
    public String menentukanKeterangan(String index) {
        String keterangan;
        if (index == "A") {
            keterangan = "Sangat Baik";
        } else if (index == "B") {
            keterangan = "Sangat Baik";
        } else if (index == "C") {
            keterangan = "Cukup";
        } else if (index == "D") {
            keterangan = "Kurang";
        } else{
            keterangan = "Sangat Kurang";
        }
        return keterangan;
    }
}
