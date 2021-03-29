package com.codewithchang;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean isLeapYear(int year) {

        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0) {
                if(year % 100 != 0) {
                    if(year % 400 == 0) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12) {
            return -1;
        } else if(year < 1 || year > 9999) {
            return -1;
        } else if
    }

}
