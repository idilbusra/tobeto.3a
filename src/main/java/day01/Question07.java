package day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question07 {
    /*
    7- kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,
    1.sınav notu,2.sınav notu,3.sınav notu isteyen ve daha sonra not ortalamasını
    hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter the number of students");
            int studentNumber=scan.nextInt();

            for (int i=1; i <=studentNumber; i++) {
                System.out.println("\n" + "Enter " + i + ". student's details");

                System.out.println("Student's name: ");
                String studentName = scan.next();

                System.out.println("Student's surname: ");
                String studentSurame = scan.next();

                System.out.println("First exam note: ");
                double firstExamNote = scan.nextDouble();

                System.out.println("Second exam note: ");
                double secondExamNote = scan.nextDouble();

                System.out.println("Third exam note: ");
                double thirdExamNote = scan.nextDouble();

                double notesAverage = (firstExamNote + secondExamNote + thirdExamNote) / 3;

                System.out.println("\n" + studentName + " " + studentSurame + "'s notes average " + notesAverage);
            }
        }catch (InputMismatchException e){
            System.out.println("Error, Invalid Input ! Please Enter a valid value :) ");
        }finally {
            scan.close();
        }
    }


}
