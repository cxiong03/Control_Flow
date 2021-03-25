package com.codewithchang;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or 4, or 5");
//                // If we wanted to get the specific value
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1, 2, 3, 4, or 5");
//                break;
//        }

        /*
        Create a new switch statement using char instead of int
        create a new char variable
        create a switch statement testing for A, B, C, D, or E
        display a message if any of these are found and then break
        Add a default which displays a message saying not found
         */

//        char letter = 'B';
//            switch(letter) {
//                case 'A':
//                    System.out.println("It is A");
//                    break;
//                case 'B':
//                    System.out.println("It is B");
//                    break;
//                case 'C': case 'D': case 'E':
//                    System.out.println( letter + " was found");
//                    break;
//                default:
//                    System.out.println("Letter not found");
//                    break;
//            }

        String month = "JANUARY";
            switch(month.toLowerCase()) {
                case "january":
                    System.out.println("Jan");
                    break;
                case "december":
                    System.out.println("Dec");
                    break;
                default:
                    System.out.println("Not sure");
            }

    }
}
