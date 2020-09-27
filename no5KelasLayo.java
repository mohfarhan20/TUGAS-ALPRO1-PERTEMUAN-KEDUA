package com.company;
import java.util.Scanner;
public class no5KelasLayo {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        float a,b,c,rata_rata;
        System.out.print(" Masukkan nilai alpro 1 : ");
        a = userInput.nextInt();
        System.out.print(" Masukkan nilai fisika : ");
        b = userInput.nextInt();
        System.out.print(" Masukkan nilai agama : ");
        c = userInput.nextInt();

        rata_rata = (a+b+c)/3;
        System.out.println(" rata - rata adalah : " + rata_rata);

    }
}
