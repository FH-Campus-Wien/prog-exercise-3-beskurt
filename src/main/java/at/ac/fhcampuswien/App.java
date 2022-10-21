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
            System.out.print(j+1 +" \n");
        }
    }
    for (int days = daysLeft + 2; days <= numberOfDays ; days++) {
        if (days < 10) System.out.print(" ");
        System.out.print(days+" ");
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

public static void guessingGame (int numberToGuess) {
    Scanner scanner = new Scanner(System.in);
    int tries = 1;
    for (int i = 1; i <= 10; i++) {
        System.out.print("Guess number " + i + ": ");
        int guess = scanner.nextInt();
        if (numberToGuess > guess && tries != 10){
            System.out.println("The number AI picked is higher than your guess.");
        }
        if (numberToGuess < guess && tries != 10){
            System.out.println("The number AI picked is lower than your guess.");
        }
        if (numberToGuess == guess){
            System.out.println("You won wisenheimer!");
            return;
        }
        tries++;
    }
        System.out.println("You lost! Have you ever heard of divide & conquer?");

}

public static int randomNumberBetweenOneAndHundred (){
    Random random = new Random();
    int randomNumber = random.nextInt(100)+1;
    return randomNumber;
}

public static boolean swapArrays(int[] array1, int[] array2){
    if (array1.length != array2.length){
        return false;
    }
    for (int i = 0; i < array1.length; i++) {
        array1[i] = array1[i] + array2[i];
        array2[i] = array1[i] - array2[i];
        array1[i] = array1[i] - array2[i];
    }
    return true;
}


public static String camelCase(String text){
    char[] s = text.toCharArray();
    if (s[0] >= 97 && s[0] <= 122)
        s[0] -= 32;
    for (int i = 0; i < s.length; i++) {
        if (i>=1&&s[i-1] == 32 && s[i] >= 97 && s[i] <= 122){
            s[i]-=32;
        }
        if (i >= 1 && s[i - 1] != 32 && s[i] >= 65 && s[i] <= 90){
            s[i]+=32;
        }
    }
    for (int i = 0; i < s.length; i++) {
        if (s[i] > 0 && s[i]<=64||s[i] >=91&& s[i] <=96||s[i] >= 123 && s[i]<=127){
            s[i]=32;
        }

    }
    String spaces = String.valueOf(s).replaceAll(" ","");
    return spaces;
}

    public static int checkDigit(int[] array) {
    int sum= 0;
    int weighting = 2;
    int residual;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * (weighting + i);
        }
        residual = sum % 11;
        int checkingDigit = 11 - residual;
        if (checkingDigit == 10){
            return 0;
        }
        if (checkingDigit == 11){
            return 5;
        }else
            return checkingDigit;
}
public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
}
}