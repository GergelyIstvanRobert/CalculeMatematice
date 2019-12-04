package org.FastTrackIt;

public class Numere {
    public static double multiply (int x,int y){
        return (x*y);
    }
    public static double multiply (double x,double y){
        return (x*y);
    }
    public static double Add (int x,int y){
        return (x+y);
    }
    public static double Add (double x,double y){
        return (x+y);
    }



    public int sumVar (int x,int y){
        int sumVar = x+y;
        System.out.println("The sum of this variable is " +sumVar);
        return sumVar;
    }
    public int summultiply (int x,int y) {
        int sumVar = x*y;
        System.out.println("The sum of this variable is " + sumVar);
        return sumVar;

    }
    public int division (int x,int y) {
        int sumVar = x/y;
        System.out.println("The sum of this variable is " +sumVar);
        return sumVar;
    }
    public int subtraction (int x,int y) {
        int sumVar = x-y;
        System.out.println("The sum of this variables is " + sumVar);
        return sumVar;
    }


}
