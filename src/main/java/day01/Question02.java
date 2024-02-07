package day01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Question02 {
    /*
    2- kullanıcıdan kaç ürün almak istediğini soran,
    her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
    (Input için Scanner ve döngü için for döngüsü kullanınız)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> productPricesList = new ArrayList<>();
         try {
             System.out.println("How many products do you want to buy? Please enter");
             int productNumber= scan.nextInt();

             for (int i=1; i<= productNumber; i++){
                 try {
                     System.out.println("Please enter the price of product "+ i);
                     double productPrice = scan.nextDouble();
                     productPricesList.add(productPrice);
                 }catch (InputMismatchException e){
                     System.out.println("Error: You entered an invalid price. Please enter a numeric value!");
                     scan.nextLine();
                     i--;
                 }
             }

             double totalPrice = 0;
             for (double productPrice : productPricesList){
                 totalPrice += productPrice;
             }

             System.out.println("Total amount of shopping payment: " + totalPrice + "TL" );
         }catch (InputMismatchException e){
             System.out.println("Error: You entered an invalid price. Please enter a numeric value!");
         }finally {
             scan.close();
         }

    }
}
