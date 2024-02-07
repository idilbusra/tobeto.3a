package day01;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Question04 {
    /*
    4-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve
    doğru tahmin edene kadar devam eden bir program yazınız.
    (While döngüsü ile yapınız ve rastgele sayı üretmek için Random sınıfını kullanınız)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) +1 ; //Parantez icindeki 10 0-9 arasini (10 haric) gosteriyor, bizden istenen 1-10 bu sebeple 1 ekledim:)

        int totalRightToEstimate=5; // Dongunun kirilmasi icin toplamda 5 tahmin hakki verdim, hak bitince dongu kiriliyor
        while (totalRightToEstimate>0){
            try {
                System.out.println("Estimate a number between 1 and 10:");
                int estimate = scan.nextInt();

                if (randomNumber==estimate){
                    System.out.println("Well done! You guessed it right :) ");
                    break;
                }else {
                    System.out.println("Wrong answer. Random Number = "+ randomNumber+ " Try again :( ");
                }
            }catch (InputMismatchException e){
                System.out.println("You logged in incorrectl! Please enter a number");
                scan.next();
            }
            totalRightToEstimate--;
        }
        scan.close();
    }
}
