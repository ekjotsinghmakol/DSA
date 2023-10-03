package org.example;

//even number of digits in a number in an array

public class Main {
    public static void main(String[] args) {
        int [] arr = {11,22,345,7828,234,235,123456};
        System.out.println(findNumbers(arr));

    }
        public static int findNumbers(int []arr){
            int count =0;
            for (int num:arr){
                if (even(num)){
                    count++;
                }
            }
            return count;
        }
        public static boolean even(int num){
            int numofdigits = digits(num);
            return numofdigits %2 == 0;


        }
        public static int digits(int num){
        int count = 0;
            while(num>0){
                count++;
                num = num/10;
            }
            return count;

        }
    }
