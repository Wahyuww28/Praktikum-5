package com.Prektikum5;

import java.util.Scanner;

public class IMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan berat badan anda : ");
        double Berat = input.nextDouble() ;
        System.out.print("Masukan tinggi anda dalam meter: ");
        double Tinggi = input.nextDouble();
        String Kriteria;
        double imt = Berat/(Tinggi*2);
        
        if (imt <= 18.4) {
            Kriteria = "Berat badan kurang";
            
        } else if(imt > 18.4 && imt <=24.9){
            Kriteria = "Berat badan ideal";
        }else if (imt >24.9 && imt <=29.9) {
            Kriteria = "Berat badan lebih";
        }else if (imt > 29.9 && imt <= 39.9 ) {
            Kriteria = "Gemuk";
        }else { Kriteria = "Sangat Gemuk";      }

        System.out.println("Kriteria kamu : " + Kriteria);
    }
}
