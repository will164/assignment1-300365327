package design5;

import java.util.concurrent.TimeUnit;

public class TimeAnalyze {

    public static void main(String[] args) {

    for (int x = 1; x < 11; x++){

        System.out.println(x);

        PointCP5 pointCP2 = new PointCP2(5*x,30*x);
        PointCP5 pointCP3 = new PointCP3(5*x,30*x);
        long startTime = System.nanoTime();
        for (int i = 0; i < 2000000000; i++) {
            pointCP2.getX();
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        elapsedTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 2000000000; i++) {
            pointCP2.getRho();
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        elapsedTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 2000000000; i++) {
            pointCP3.getRho();
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        elapsedTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 2000000000; i++) {
            pointCP3.getRho();
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        elapsedTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Elapsed time: " + elapsedTime);
    }

    }

}
