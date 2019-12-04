package org.FastTrackIt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { System.out.println( "Hello World!" );

        Numere sumVar = new Numere();
        sumVar.sumVar(11,11);

        Numere multiply = new Numere();
        sumVar.multiply(12.3,2.4);

        Numere division = new Numere();
        sumVar.division(333,3);

        Numere subtraction = new Numere();
        sumVar.subtraction(123,65);





        int x = 13;
        int y = 7;
        int results;

        results = x+y;
        System.out.println("The result is " + results);
        results = x-y;
        System.out.println("The result is " + results);
        results = x*y;
        System.out.println("The result is " + results);
        results = x/y;
        System.out.println("The result is " + results);

    }



}
