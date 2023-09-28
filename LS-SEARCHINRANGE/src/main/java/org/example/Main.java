package org.example;

//Searching for a number in between a particular range in an array.
public class Main {
    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,6};
        int target = 5;
        int start = 2;
        int end = 5;

       System.out.println(searchInrange(arr,target,start,end));

    }
    public static int searchInrange(int[]arr,int target, int start, int end){
        for (int i= start;i<end; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }

    }
