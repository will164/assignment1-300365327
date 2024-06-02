package design2;

import java.util.concurrent.TimeUnit;

public class TimeAnalyze {

    public static void main(String[] args) {

    for (int x = 1; x < 11; x++){

        System.out.println(x);

        PointCP2 pointCP = new PointCP2(5*x,30*x);
        long startTime = System.nanoTime();
        for (int i = 0; i < 2000000000; i++) {
            pointCP.getX();
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        elapsedTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 2000000000; i++) {
            pointCP.getRho();
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        elapsedTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime);
    }

    }

}
