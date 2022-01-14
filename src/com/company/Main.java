package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = createAnArray(6);
        int arraySum = sumArray(myArray);
        System.out.println(average(arraySum,myArray.length));

    }
    public static float kmToMile(double kmph){
        float KM_TO_MILE = 1.609344f;
        float converted =(float) kmph* KM_TO_MILE;
        System.out.println(kmph+" KiloMiter ~ ==> " + converted+ " Mile");
        return converted;
    }

    public static String KbToMega(int kb){
        int MB = 1024;
        return (kb+ " KB= "+ (int)kb/MB+ " MB and " +kb%MB + "KB");
    }
    private static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        return (isBarking&&hourOfDay>0&&((hourOfDay<23 || hourOfDay >21) || hourOfDay<8));
    }
    private static boolean isLeapYear(int year){
        return (year>0 && year < 9999 &&(year%4==0 && (year%400==0||year%100!=0)));
    }
    private static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        return ((int)(num1*1000 - num2*1000) == 0);
    }
    private static boolean hasEqualSum(int a, int b, int c){
        return (a+b==c||a+c==b||b+c==a);
    }
    private static void PPP(boolean a){
        System.out.println(a);
    }
    private static int[] createAnArray(int arrayLength){
        var scanner = new Scanner(System.in);
        int[] intArray = new int[arrayLength];
        for (int i=0; i<arrayLength; i++){
            System.out.println("Enter the number #: "+ (i+1));
            intArray[i]= scanner.nextInt();
        }return intArray;
    }
    private static int sumArray(int[] array){
        int arrayTotal = Arrays.stream(array).sum();
        return arrayTotal;
    }
    private static float average(int sum, int count){
        return (float) sum/count;
    }
    static void strangeThing(){
        System.out.println(8+2+"string" + 8 +2);
    }


}
