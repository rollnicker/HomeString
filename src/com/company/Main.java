package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String userStr = scan.nextLine();
        System.out.println("Вы написали: "+userStr);

    }
}



