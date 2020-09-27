package com.company;
import java.util.Scanner;
public class no8KelasLayo {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);

        int tahunLahir,tahunIni,umur;

        System.out.print("Masukkan Tahun lahir : ");
        tahunLahir = userInput.nextInt();
        System.out.print("Masukkan Tahun Sekarang : ");
        tahunIni = userInput.nextInt();

        umur = tahunIni-tahunLahir;

        System.out.println(" Umur anda adalah : " + umur);

    }
}
