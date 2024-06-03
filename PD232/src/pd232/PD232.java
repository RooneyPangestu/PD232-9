/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd232;

import java.io.*;

public class PD232 {
    public static int totalSPP; //variabel global (bisa dibaca disemua blok program)

    public static void main (String[] args){
        //step 3: deklarasi bufferedreader
        BufferedReader br = new BufferedReader
        (new InputStreamReader (System.in));
        // soal latihan1

        // step2
        try {
            do {
                // variabel
                String nim, nama;
                int jml_semester;

                // Menu dg Switch-Case
                System.out.println("------------------");
                System.out.println("1. Input Data");
                System.out.println("2. Output Data");
                System.out.println("3. Logout");
                System.out.println("------------------");
                System.out.print("Pilih menu : ");
                // inputan dg bufferedreader (tipe: int)
                int menu = Integer.parseInt(br.readLine());

                switch (menu) {
                    case 1: //menu 1
                        System.out.print("Isi NIM : ");
                        //input bufferedreader tipe string
                        nim = br.readLine();
                        System.out.print("Isi Nama : ");
                        nama = br.readLine();
                        System.out.print("Isi Semester yg " + "Sudah di tempuh : ");
                        jml_semester = Integer.parseInt(br.readLine());

                        //cara call function/fungsi
                        total_SPP(jml_semester);
                        System.out.println("totalSPP: " + total_SPP(jml_semester));

                        break; //program break
                    case 2: //menu 2
                        //cetak data (nim, nama, jml_semester)
                        break;
                    default: //else
                        System.exit(0);//perintah keluar program
            
                } 
            } while (true);
            
        } catch (Exception e) {
        // jika ada kesalahan dari blok try
        // kelebihan: error mudah dipahami
        System.out.println("error adalah: " + e.getMessage());
        }  

    }

    //membuat fungsi
    static public int total_SPP(int smt) { //int smt ==> parameter
        //nilai yg dikembalikan = variabel totalSPP
        //contoh: 4 smt x 15000000 = 60000000
        totalSPP = smt * 15000000;
        return totalSPP;
    }

    //membuat prosedur
    public void cetakData() {

    }
    
}
