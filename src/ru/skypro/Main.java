package ru.skypro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        printOddNumbers(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        printEvenNumbers(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        printUniqueFruits(new ArrayList<>(List.of("яблоко", "малина", "ежевика", "черника", "яблоко", "ежевика")));
        printNumberOfDuplicates(new ArrayList<>(List.of("яблоко", "малина", "ежевика", "черника", "яблоко", "ежевика")));
    }
    //Задание №1
    public static void printOddNumbers(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    //Задание №2
    public static void printEvenNumbers(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    //Задание №3
    public static void printUniqueFruits(List<String> fruits) {
        Set<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println(uniqueFruits);
    }
    //Задание №4
    public static void printNumberOfDuplicates(List<String> fruits) {
        Set<String> numberOfDuplicates = new HashSet<>(fruits);
        System.out.println(fruits.size() - numberOfDuplicates.size());
    }
}