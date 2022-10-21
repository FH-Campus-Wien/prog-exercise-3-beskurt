package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
public static void oneMonthCalendar(int numberOfDays, int firstDay){
    int week = 0;
    int daysLeft = 7 - firstDay;
    System.out.print(" ");
    for (int i = 0; i < firstDay - 1; i++) {
        System.out.print("   ");
    }
    for (int j = 0; j < daysLeft + 1; j++) {
        if (j < daysLeft){
            System.out.print(j + 1 + "  ");
        }else {
            System.out.print(j+1 +"\n");
        }
    }
    for (int days = daysLeft + 2; days <= numberOfDays ; days++) {
        if (days < 10) System.out.print(" ");
        System.out.printf(days+" ");
        week++;
        if (week % 7 ==0||days == numberOfDays) System.out.println();
    }
}

public static long [] lcg (long seed){
    long m = (long) Math.pow(2,31);
    int a = 1103515245;
    short c = 12345;
    long array [] = new long[10];

    for (int i = 0; i < 10; i++) {
        seed = (a * seed + c) % m;
        array[i] = seed;
    }
    return array;
}

public static void guessingGame (int numberToGuess){
    Scanner scanner = new Scanner(System.in);
    int guess = 0;
    for (int i = 1; i <= 10; i++) {
        System.out.print("Guess number " + i + ":");
    }



}








    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        oneMonthCalendar(30,6);
        //lcg(0);
    }
}