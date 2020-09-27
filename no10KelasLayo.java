package com.company;
import java.util.Scanner;
public class no10KelasLayo {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        int x,y,z;

        System.out.print(" Masukkan Nilai X :");
        x = userInput.nextInt();
        System.out.print(" Masukkan Nilai Y : ");
        y = userInput.nextInt();

        z = x % y;

        System.out.print("Sisa Hasil baginya adalah = " + z);

    }
}
