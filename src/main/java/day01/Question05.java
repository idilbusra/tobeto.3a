package day01;

import java.util.Scanner;

public class Question05 {
    /*
    5- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.
     */

    //Mukemmel sayi, -kendisi haric- pozitif bolenlerinin toplami,  kendisine esit olan bir dogal sayidir.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        if (isPerfectNumber(number)){
            System.out.println(number+" is a perfect number.");
        }else {
            System.out.println(number+" is not a perfect number.");
        }
        scan.close();
    }

    public static boolean isPerfectNumber(int number){
        if (number<= 0 ){ // Negatif sayilar bolum olamayacagi icin mukemmel sayi olamaz
            return false;
        }
        int total= 0;
        for (int i =1; i<= number / 2; i++){
            if (number % i ==0){
                total += i;
            }
        }
        return total == number;
    }
}