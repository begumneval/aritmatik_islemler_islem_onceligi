package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan sayıları isteyen kod bloğu
        System.out.print("3 sayı giriniz: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        //Sonucu hesaplayan ve bastıran kod bloğu
        double result = a+b*c-b;
        System.out.println("Sonuç= " + result);







    }
}