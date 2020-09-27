package com.company;
import java.util.Scanner;
public class no11KelasLayo {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        float a,b;
        float c;

        System.out.print(" Masukkan Nilai A : ");
        a = userInput.nextInt();

        b = (2*a*a)+a-1;
        c = (73+b)/3;
        System.out.println(" Nilai C adalah : " + c);


    }
}
