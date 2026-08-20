package com.example.tasks;

public class Mathclass {


    public boolean checkEvenOdd(int a){
        if (a%2==0){
            return true;
        }else {
            return false;
        }
    }


    public static String MultCheck(int a, int b){
        if (a%b == 0){
            return "a is a multiple of b";
        }else {
            return "a is not a multiple of b";
        }
    }



}
