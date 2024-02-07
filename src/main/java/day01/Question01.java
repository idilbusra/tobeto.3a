package day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question01 {
    /*
    1- Switch case ile müşteriden alınan sipariş numarasına göre hangi ürünün
    sipariş edildiğini belirleyen algoritma yazınız.Input için Scanner kullanınız
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Can you enter your order number?");
            int orderNumber = scanner.nextInt();

            switch (orderNumber) {
                case 1:
                    System.out.println("Tshirt has been order received.");
                    break;
                case 2:
                    System.out.println("Skirt order has been received.");
                    break;
                case 3:
                    System.out.println("Shoes order has been received.");
                    break;
                case 4:
                    System.out.println("Pant order has been received.");
                    break;
                case 5:
                    System.out.println("Coat order has been received.");
                    break;
                default:
                    System.out.println("You have entered an invalid order number");
                    break;

            }
        }catch (InputMismatchException exception) {
            System.out.println("Please enter valid order number");
        } finally {
            scanner.close();
        }


    }
}
