package org.FastTrackIt;

public class LogicalOp {

    public void exercise1(int x) {
        for(int i=x; i<100; i++){
            System.out.println(i+" ");
        }

    }

    public void exercise2(int x) {
        for(int i=x; i >= -100; i--){
            System.out.println(i+" ");
        }

    }

    public void exercise3(int x,int y) {
        if (x<y) {
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
        }else {
            for (int i = x; i >= y; i++) {
                System.out.print(i + " ");
            }

        }


    }

    public void exercise5() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i + " ");
        }



    }

    public void exercise6() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i + " ");
        }



    }

    public int exercise7(int x) {
        int sum = 0;
        for(int i = x; i <= 100; i ++){
            sum+= i;
        }
        System.out.println(sum);
        return sum;

    }

    public double exercise8(int x) {
        double sum = 0;
        for(double i = x; i <= 100; i ++){
            sum+=i;

        }
        double average =sum / (100-x+1);
        System.out.println(average);
        return average;

    }














}
