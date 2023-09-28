package org.example;

// Check in a string if the target exists


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String str = "Ekjot";
    char target = 'm';

    System.out.println(searchInString(str,target));
    System.out.println(Arrays.toString(str.toCharArray()));

    }

    public static boolean searchInString(String str, char target){
        if (str.length()==0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if (ch== target)
                return true;
        }
        return false;
    }
}