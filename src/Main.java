/*
  nameApi test - 23rd April 2018

  Create a thing that can be offered numbers.

  At any given time it can tell 3 things:
  1) the smallest number it has encountered so far
  2) the largest number it has encountered so far
  3) the average of all numbers it has encountered so far

  Prove that it is working correctly. Make it so that a novice programmer
  cannot get it wrong, or that an evil programmer cannot break it easily
*/

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        System.out.println("\nEnter number \nType 'd' for data \nType 'x' for exit");
        Scanner scanner = new Scanner(System.in);
        Thing th2 = new Thing();
        while (true) {

            System.out.print("Enter number: ");
            String input = scanner.nextLine();


            if ("x".equals(input)) {
                System.out.println("Exit!");
                System.exit(0);
            } else if("d".equals(input)) {
                th2.show();
                System.out.println("\nSmallest number = " + th2.getSmallest());
                System.out.println("Largest number = " + th2.getLargest());
                System.out.println("Average number = " + th2.getAverage() + "\n");
            } else {
                try {
                    th2.addNum(Integer.parseInt(input));
                } catch (Exception e){
                    System.out.println("\nPlease enter a number");
                }
            }
        }

    }
}
