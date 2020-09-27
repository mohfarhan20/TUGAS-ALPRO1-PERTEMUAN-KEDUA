package com.company;
import java.util.Scanner;
import java.math.*;
// 4.	Buatlah program untuk menghitung panjang sisi miring
// suatu segitiga siku-siku demgam sisi datar dan sisi
// tegaknya diinputkan dari keyboard. (petunjuk:
// gunakan perintah library/paket import java.math.*; dan perpangkatan ab
// dengan fungsi  Math.pow(a,b) dan pengakaran   √a dengan fungsi Math.sqrt(a))

public class no4KelasLayo {
    public static void main (String [] args){
       Scanner userInput = new Scanner(System.in);
       int a,b;
        System.out.println(" Masukkan nilai a = ");
        a = userInput.nextInt();
        System.out.println(" Masukkan nilai b = ");
        b= userInput.nextInt();

       float  c = (float)(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        System.out.println(" sisi miring adalah = " + c);










    }


}
