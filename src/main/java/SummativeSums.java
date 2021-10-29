/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calebdiaz
 */
public class SummativeSums {
    
    /*
    Add() takes int array and sums its elements
    */
    public static int Add(int[] ints){
        int sum = 0;
        for (int i = 0; i<ints.length; i++){
            sum+=ints[i];
        }
        return sum;
    }
    
    public static void main(String[] args){
        int[] test1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] test2 = { 999, -60, -77, 14, 160, 301 };
        int[] test3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        
        System.out.println("#1 Array Sum: "+Add(test1));
        System.out.println("#2 Array Sum: "+Add(test2));
        System.out.println("#3 Array Sum: "+Add(test3));
    }
}
