package day01;

public class Question06 {
       /*
       6- String metotlarını araştırınız. Her bir metot için örnek yapınız.
        */
    public static void main(String[] args) {
        String str = "Java Candir.";

        System.out.println("Tum harfleri buyultur => " + str.toUpperCase());

        System.out.println("Tum harfleri kucultur => " + str.toLowerCase());

        System.out.println("Toplam karakter sayisini dondurur => " + str.length());

        System.out.println("Belirtilen index(parantez icindeki sayi-1)'teki karakteri dondurur => " + str.charAt(5));

        System.out.println("Belirtilen karakteri iceriyorsa true dondurur, aksi halde false dondurur => " + str.contains("a"));

        System.out.println("Belirtilen karakter/karakterleri ayni sekilde iceriyorsa true dondurur, aksi halde false dondurur => "+ str.equals("Java"));

        System.out.println("Belirtilen karakter/karakterleri harf hassasiyeti olmadan iceriyorsa true dondurur, aksi halde false dondurur => "+ str.equalsIgnoreCase("java"));

        System.out.println("Belirtilen sayidaki indexten itibaren kalan tum karakterleri yazdirir => " + str.substring(5));

        System.out.println("Belirtilen indexler arasi kalan tum karakterleri yazdirir, sondaki haric => " + str.substring(5,8));

        System.out.println("Belirtilen karakter/karakterler ile basliyorsa true dondurur => " + str.startsWith("Jav"));

        System.out.println("Belirtilen karakter/karakterler ile bitiyorsa true dondurur => " + str.endsWith("."));

        System.out.println("Belirtilen karakterin indexini dondurur => " + str.indexOf("C"));

        System.out.println("Parantezde belirtilen karakterlerden soldakini sagdaki ile degistirir => " + str.replace('a', 'A'));








    }
}
