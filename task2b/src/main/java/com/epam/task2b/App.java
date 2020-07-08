package com.epam.task2b;

import com.epam.chocolates.Chocolate;
import com.epam.gift.Gift;
import com.epam.sweets.Sweet;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Chocolate> chocolates = Arrays.asList(Database.chocolates);
        List<Sweet> sweets = Arrays.asList(Database.sweets);
        Gift gift = new Gift();
        gift.addChocolates(chocolates.get(0), chocolates.get(2));
        gift.addSweets(sweets.get(1), sweets.get(2));
        int choose;
        do {
            System.out.println("===============================");
            System.out.println("1.View Sweets \n" +
                    "2.View Chocolates \n" +
                    "3.Find Most Expensive Chocolate \n" +
                    "4.Find Most Cheap Chocolate \n" +
                    "5.Find Most Expensive Sweet \n" +
                    "6.Find Most Cheaper Sweet \n" +
                    "7.View All Chocolates\n" +
                    "8. View All Sweets" +
                    "9.Exit");
            System.out.print("Enter your Choice: ");
            choose = scanner.nextInt();
            System.out.println("\nResults");
            switch (choose) {
                case 1:
                    gift.getSweets().forEach(System.out::println);
                    break;
                case 2:
                    gift.getChocolates().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println(gift.getChocolates().stream().max(Chocolate::compareTo).get());
                    break;
                case 4:
                    System.out.println(gift.getChocolates()
                            .stream().min(Chocolate::compareTo).get());
                    break;
                case 5:
                    System.out.println(gift.getSweets().stream().max(Sweet::compareTo).get());
                    break;
                case 6:
                    System.out.println(gift.getSweets()
                            .stream().min(Sweet::compareTo).get());
                    break;
                case 7:
                    chocolates.forEach(System.out::println);
                    break;
                case 8:
                    sweets.forEach(System.out::println);
                    break;

            }
        } while (choose <= 8);

    }

}
