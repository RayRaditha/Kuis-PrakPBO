/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

/**
 *
 * @author Raditha
 */
public class Pendaftaran implements Seleksi {
    String nik;
    String nama;
    double nilaiTulis;
    double nilaiCoding;
    double nilaiWawancara;

    public Pendaftaran(String nik, String nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        this.nik = nik;
        this.nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilaiTulis() {
        return nilaiTulis;
    }

    public void setNilaiTulis(double nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

    public double getNilaiCoding() {
        return nilaiCoding;
    }

    public void setNilaiCoding(double nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public double getNilaiWawancara() {
        return nilaiWawancara;
    }

    public void setNilaiWawancara(double nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }

    @Override
    public double seleksiTulis() {
        return 0;
    }

    @Override
    public double seleksiCoding() {
        return 0;
    }

    @Override
    public double seleksiWawancara() {
        return 0;
    }

    

   
}
