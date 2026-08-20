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
            return (a+ " is a multiple of " +b);
        }else {
            return (a+" is not a multiple of "+b);
        }
    }


    public static String remainder(int a, int b){
        int remainder = a%b;
        return ("the remainder of "+ a +" and "+b+ " is "+remainder);
    }

    public static String Roots(int a){
        if (a > 0){
            return "two distinct real roots";
        } else if (a < 0) {
            return "no real roots, two complex conjugate roots";
        }else{
            return " two equal real roots, one distinct real root";
        }
    }


    public static String Grade(double a){
        if (a >=90){
            return "you got an a";
        } else if (a >= 80) {
            return "you got an b";
        } else if ( a >=70) {
            return "you got an c";
        } else if (a >= 60) {
            return "you got an d";
        } else{
            return "you got an f";

        }

    }






}
