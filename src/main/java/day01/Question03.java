package day01;

import java.util.Scanner;

public class Question03 {
    /*
    3- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.
     */

    public static void main(String[] args) {
         /*
           ****  Bilgi Notu- Aciklama ****
            While loop'da kullanacagimiz variable'lara bastan deger atamamiz gerekir,
            eger bu variable'lara yanlis deger atamasi yaparsak while loop body'si hic calismayabilir.
            Java bu dezavantaji ortadan kaldirmak icin do while loop olusturmustur,
            do-while loop ilk kontrolu yapmadan kodu 1 kez calistirir sonra kontrol yapar.
            while loop'da loop body'sinin hic calismama ihtimali VARDIR
            do-while loop'da loop body'sinin hic calismama ihtimali YOKTUR
         */

        // ORNEK: kullanicidan sayi degerleri alip toplayalim
        // kullanici 0'a bastiginda islem bitsin ve toplami yazdirsin


        //WHILE
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int total = 0;

        System.out.println("Please write a number to sum \nPress 0 to finish");
        number = scanner.nextInt();
        total += number;

        while (number != 0) {
            System.out.println("==== WHILE ====");
            System.out.println("Please write a number to sum \nPress 0 to finish");
            number = scanner.nextInt();
            total += number;
        }

        System.out.println("Sum of entered numbers : " + total);


        //DO WHILE
        Scanner scanner2 = new Scanner(System.in);

        int number2 = 0;
        int total2 = 0;
        do {
            System.out.println("==== DO WHILE ====");
            System.out.println("Please write a number to sum \nPress 0 to finish");
            number2 = scanner2.nextInt();
            total2 += number2;
        } while (number2 != 0);
        System.out.println("Sum of entered numbers : " + total2);

    }



    }


