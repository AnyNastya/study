package com.company;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a = 0, b = 0, c = 0, D, temp;

        Scanner s = new Scanner(System.in);
        System.out.println("== The solution of the quadratic equation ==");
        System.out.println("Enter coefficients:");
        System.out.print("a = ");
        a = s.nextDouble();
        System.out.print("b = ");
        b = s.nextDouble();
        System.out.print("c = ");
        c = s.nextDouble();

        D = b*b-4*a*c;
        System.out.print("The discriminant: ");
        System.out.format("%.3f%n", D);
        System.out.println("The answer(s) of the quadratic equation:");
        temp = -b/ 2 / a;
        if (D >= 0.0) {
            System.out.print("x1 = ");
            System.out.format("%.3f%n" , temp + sqrt(D) / 2 / a);
            System.out.print("x2 = ");
            System.out.format("%.3f%n", temp - sqrt(D) / 2 / a);
        }
        if(D < 0.0) {
            System.out.print("x1 = ");
            System.out.format("%.3f", temp); //Действительная часть корня
            System.out.print(" + i*");
            System.out.format("%.3f%n", (sqrt(-D) / 2 / a)); //Мнимая часть корня

            System.out.format("x2 = ");
            System.out.format("%.3f", temp);
            System.out.print(" - i*");
            System.out.format("%.3f%n", (sqrt(-D) / 2 / a));
        }
        }
    }
