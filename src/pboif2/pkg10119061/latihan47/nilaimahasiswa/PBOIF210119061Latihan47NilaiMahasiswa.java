/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan47.nilaimahasiswa;
import java.util.Scanner;
/**
 *
 * @author Rheiza
 * NAMA     : Rheiza Akmal R
 * KELAS    : IF2
 * NIM      : 10119061

 */
public class PBOIF210119061Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        int quis,uts,uas;
        
        System.out.print("QUIZ\t:");
        quis = scanner.nextInt();
        System.out.print("UTS\t:");
        uts = scanner.nextInt();
        System.out.print("UAS\t:");
        uas = scanner.nextInt();
        
        nilai.setQuis(quis);
        nilai.setUts(uts);
        nilai.setUas(uas);
        System.out.println();
        System.out.println("Nilai Akhir\t:" + nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas()));
        System.out.println();
        System.out.println("Index = " + nilai.menentukanIndex(nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas())));
        System.out.println("Ketarangan =" + nilai.menentukanKeterangan(nilai.menentukanIndex(nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas()))));
    }
    
}
