/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;
import java.util.Scanner;
/**
 *
 * @author Raditha
 */
public class KuisPBO {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int inputMenu;
        int pilih;
        boolean y = false;
        
        System.out.println("Form Pendaftaran PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        inputMenu = input.nextInt();
        
        switch(inputMenu) {
            case 1:
                String nik;
                String nama;
                double nilaiTulis;
                double nilaiCoding;
                double nilaiWawancara;
                
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                System.out.println("FORM PENDAFTARAN\n");
                System.out.print("Input NIK : ");
                nik = data.nextLine();
                System.out.print("Input Nama : ");
                nama = data.nextLine();
                System.out.print("Input Nilai Tes Tulis : ");
                nilaiTulis = data.nextDouble();
                System.out.print("Input Nilai Tes Coding : ");
                nilaiCoding = data.nextDouble();
                System.out.print("Input Nilai Tes Wawancara : ");
                nilaiWawancara = data.nextDouble();
                PenilaianAndroid penilaianAndroid = new PenilaianAndroid(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilih = input.nextInt();
                  
                    switch(pilih) {
                        case 1:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : "); penilaianAndroid.nilaiTulis = inputBaru.nextDouble();
                            System.out.print("Input Nilai Tes Coding : "); penilaianAndroid.nilaiCoding = inputBaru.nextDouble();
                            System.out.print("Input Nilai Tes Wawancara : "); penilaianAndroid.nilaiWawancara = inputBaru.nextInt();
                            break;
                        case 2:
                            double nilaiAkhir;
                            String namaUser;
                            System.out.println(" ");
                            
                            nilaiAkhir = penilaianAndroid.seleksiTulis() + penilaianAndroid.seleksiCoding() + penilaianAndroid.seleksiWawancara();
                            namaUser = penilaianAndroid.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                    System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf Kepada " + namaUser + " Telah Ditolak Sebagai Android Developer");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaUser + " Telah Diterima Sebagai Android Developer");
                            }
                            break;
                        case 3:
                            y = true;
                            break;
                    }
                } while(!y);
                break;
                
            case 2:
                String nikW;
                String namaW;
                double nilaiTulisW;
                double nilaiCodingW;
                double nilaiWawancaraW;
                
                System.out.println(" ");
                Scanner dataweb = new Scanner(System.in);
                System.out.println("FORM PENDAFTARAN\n");
                System.out.print("Input NIK : ");
                nikW = dataweb.nextLine();
                System.out.print("Input Nama : ");
                namaW = dataweb.nextLine();
                System.out.print("Input Nilai Tes Tulis : ");
                nilaiTulisW = dataweb.nextDouble();
                System.out.print("Input Nilai Tes Coding : ");
                nilaiCodingW = dataweb.nextDouble();
                System.out.print("Input Nilai Tes Wawancara : ");
                nilaiWawancaraW = dataweb.nextDouble();
                PenilaianWeb penilaianWeb = new PenilaianWeb(nikW, namaW, nilaiTulisW, nilaiCodingW, nilaiWawancaraW);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilih = input.nextInt();
                  
                    switch(pilih) {
                        case 1:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : "); penilaianWeb.nilaiTulis = inputBaru.nextDouble();
                            System.out.print("Input Nilai Tes Coding : "); penilaianWeb.nilaiCoding = inputBaru.nextDouble();
                            System.out.print("Input Nilai Tes Wawancara : "); penilaianWeb.nilaiWawancara = inputBaru.nextInt();
                            break;
                        case 2:
                            double nilaiAkhir;
                            String namaUser;
                            System.out.println(" ");
                            
                            nilaiAkhir = penilaianWeb.seleksiTulis() + penilaianWeb.seleksiCoding() + penilaianWeb.seleksiWawancara();
                            namaUser = penilaianWeb.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf Kepada " + namaUser + " Telah Ditolak Sebagai Web Developer");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaUser + " Telah Diterima Sebagai Web Developer");
                            }
                            break;
                        case 3:
                            y = true;
                            break;
                    }
                } while(!y);
                break;
                
            default:
                break;
        }
    }
}
