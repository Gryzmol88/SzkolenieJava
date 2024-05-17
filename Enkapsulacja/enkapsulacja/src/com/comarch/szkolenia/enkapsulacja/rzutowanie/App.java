package com.comarch.szkolenia.enkapsulacja.rzutowanie;

public class App {
    public static void main(String[] args) {
      int i = 7;// Konwersja
      double d = i;

        System.out.println(i);
        System.out.println(d);


        double d2 = 7.5;
        int i2 = (int) d2; // Rzutowanie
        System.out.println(i2);

        int a = 5;
        int b = 2;
        double wynik = ((double) a) / ((double) b);
        System.out.println(wynik);

        String s = "5";
        int x = Integer.parseInt(s);
        boolean bool = true;
        String s2 = bool + "";
        String s3 = String.valueOf(bool);


    }
}


