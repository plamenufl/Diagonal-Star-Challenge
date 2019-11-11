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
            // r stands for row and c stands for column
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

