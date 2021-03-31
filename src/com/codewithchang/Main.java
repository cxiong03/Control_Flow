package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            switch (year) {
                case 0:
                    if (year % 4 == 0 || year % 100 != 0 || year % 400 == 0) {
                        System.out.println("True");
                        break;
                    }

                default:
                    return false;
            }

//
//    public static int getDaysInMonth(int month, int year) {
//        if(month < 1 || month > 12) {
//            return -1;
//        } else if(year < 1 || year > 9999) {
//            return -1;
//        } else if(isLeapYear(year) == true) {
//
//        }
//    }
        }
        return false;
    }
}