package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(20);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int rowCount = 0;
            for (int r = 1; r <= number; r++) {

                for(int c = 1; c <= number; c++){
                    if(r == 1 || r == number){
                        System.out.print("*");
                    }
                    if(c == 1 && r > 1 && r < number){
                        System.out.print("*");

                    }
                    if(c != 1 && c != number && r > 1 && r < number){
                        if(r == c || (c == number - rowCount) ){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }



                    }
                    if(c == number && r > 1 && r < number){
                        System.out.print("*");

                    }

                }
                System.out.println();
                rowCount++;

            }
        }
    }
}
// if row = 2 and column = 2 rowcount is 1
// subtract rowcount 1 from column(number)5  = column = 4 row = 2  rowcount++

// if row = 3 and column = 3 rowcount = 2
// subtract rowcount 2 from column(number)5  = column = 3 row = 2  rowcount++

// if row = 4 and column = 4 rowcount = 3
// subtract rowcount 3 from column (number)5 = column = 2 and row = 4
