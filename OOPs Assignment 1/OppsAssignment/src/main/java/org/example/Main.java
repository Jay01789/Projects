package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter in put");
        int n = scn.nextInt();
        int[] arr=new int[n];
        for(int i=0 ;i<n ;i++){
            arr[i] = scn.nextInt();
        }
        solve(arr,n);

    }

    private static void solve(int[] arr, int n) {
        int target = 0 ;

        for(int i=0 ;i<n ;i++){
            if(i > 0  && arr[i] == arr[i+1])continue ;
            int left = i+1 , right = n-1 ;
            while(left<right){
                int curr = arr[i] + arr[left] + arr[right];
                if(curr == target){
                    System.out.println(arr[i] + " " +  arr[left] + " " +  arr[right]);
                    return ;
                }else if(curr > target){
                    right-- ;
                }else left++ ;
            }
        }
        System.out.print("No Elements found");

    }
}