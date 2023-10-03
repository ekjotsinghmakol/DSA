package org.example;

// Finding the smallest number in an array
public class Main {
    public static void main(String[] args) {

    int []arr = {1,2,3,4,5,6,7,8,9};
    System.out.println(minNum(arr));
        }

        public static int minNum(int []arr ){
        int ans= arr[0];
        for (int i =0;i< arr.length;i++){

            if (ans >arr[i]){
                ans = arr[i];
            }
        }
        return ans;
        }


    }
