package org.example;

/* Q: Search for a specific element in an array and return their index. */

public class Main {
    public static void main(String[] args) {
        int[] arr ={8,10,20,30,405,50};
        int target = 405;
        int result = linearSearch(arr,target);
        System.out.println(result);
    }

        public static int linearSearch(int[] arr, int target){
            if (arr.length== 0){
                return -1;
            }
            for (int i =0; i< arr.length;i++){
                int element = arr[i];
                if (element == target) {
                    return i;
                }
            }
            return -1;
        }


    }
