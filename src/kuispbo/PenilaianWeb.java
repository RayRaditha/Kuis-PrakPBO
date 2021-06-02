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
public class PenilaianWeb extends Pendaftaran implements Seleksi {

    public PenilaianWeb(String nik, String nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        super(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
    }

    
    @Override
    public double seleksiTulis() {
        return (double) (this.nilaiTulis * 0.4);
    }

    @Override
    public double seleksiCoding() {
        return (double) (this.nilaiCoding * 0.35);
    }

    @Override
    public double seleksiWawancara() {
        return (float) (this.nilaiWawancara * 0.25);
    }
}
