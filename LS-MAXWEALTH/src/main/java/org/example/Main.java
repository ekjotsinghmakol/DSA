package org.example;
//https://leetcode.com/problems/richest-customer-wealth

public class Main {
    public static void main(String[] args) {

    }

    public static int maxWealth(int[][] accounts) {
//        person = row;
//        account = col;
        int ans = Integer.MIN_VALUE;
//        for (int person =0; person< accounts.length;accounts++){
        for (int[] ints : accounts) {
            int sum = 0;
//            for (int account =0;account < account[person].length; account ++){

            for (int anInt : ints) {
                sum += anInt;
                if (sum > ans) {
                    ans = sum;
                }
            }
        }
        return ans;
    }
}