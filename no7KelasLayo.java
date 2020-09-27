package com.company;
import java.util.Scanner;
public class no7KelasLayo {
    public static void main (String [] args){
        Scanner us = new Scanner(System.in);
        float a, b, c;

        System.out.print(" Masukkan Nilai A = ");
        a = us.nextInt();
        System.out.print(" Masukkan Nilai B = ");
        b = us.nextInt();
        System.out.print(" Masukkan Nilai C = ");
        c = us.nextInt();

        if (a < b && a < c) {
            System.out.println(" N min adalah : " + a);
        } else if (b < a && b < c) {
            System.out.println(" N min adalah : " + b);
        } else if (c < a && c < b) {
            System.out.println(" N min adalah : " + c);
        } else if (a == b && b < c) {
            System.out.println(" N min adalah : " + a);
        } else if (b == c && c < a) {
            System.out.println(" N min adalah : " + b);
        } else if (c == a && a < b) {
            System.out.println(" N min adalah : " + c);
        } else if (a == b && b < c) {
            System.out.println(" N min adalah : " + c);

        } else if (b == c && c > a) {
            System.out.println(" N min adalah : " + a);

        } else if (c == a && a > b){
            System.out.println(" N min adalah : " + b);

        }

        else {

            System.out.println(" Semua Nilai sama tak ada N min");
        }
    }
}
