package com.example.tasks;

public class Coordsclass {

    public static String slope(int x1,int x2,int y1,int y2){
        if (x2 == x1) {
            return "undefined";
        }
        String slope = String.valueOf((y2-y1)/(x2-x1));
        return slope;

    }

    public static String mdpoint(int x1,int x2,int y1,int y2){
        String x = String.valueOf((x2+x1)/2);
        String y = String.valueOf((y2+y1)/2);
        return ("(" + x + "," + y + ")");
    }


}
