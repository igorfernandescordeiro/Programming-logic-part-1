package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        int number = -1;
        Scanner in = new Scanner(System.in);

        do {

            System.out.println("\nType any integer: ");
            input = in.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Just intergers allowed ");
                continue;
            }

            if (number % 3 == 0 ){
                System.out.print("Cira");
            }
            if (input.contains("5")){
                System.out.print("Dinha");
            }

        } while (number != 0);


    }
}
