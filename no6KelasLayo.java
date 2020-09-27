package com.company;
import java.util.*;
public class no6KelasLayo {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        float a, b, c;

        System.out.print(" Masukkan Nilai A = ");
        a = us.nextInt();
        System.out.print(" Masukkan Nilai B = ");
        b = us.nextInt();
        System.out.print(" Masukkan Nilai C = ");
        c = us.nextInt();

        if (a > b && a > c) {
            System.out.println(" N max adalah : " + a);
        } else if (b > a && b > c) {
            System.out.println(" N max adalah : " + b);
        } else if (c > a && c > b) {
            System.out.println(" N max adalah : " + c);
        } else if (a == b && b > c) {
            System.out.println(" N max adalah : " + a);
        } else if (b == c && c > a) {
            System.out.println(" N max adalah : " + b);
        } else if (c == a && a > b) {
            System.out.println(" N max adalah : " + c);
        } else if (a == b && b < c) {
            System.out.println(" N max adalah : " + c);

        } else if (b == c && c < a) {
            System.out.println(" N max adalah : " + a);

        } else if (c == a && a < b){
            System.out.println(" N max adalah : " + b);

        }

        else {

            System.out.println(" Semua Nilai sama tak ada1 N max");
        }
        }
    }
