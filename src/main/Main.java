package main;

public class Main {
    public static void main(String[] args) {

        System.out.println(minuteToSecond(60));
    }

    public static int minuteToSecond(int t) {
        return 60 * t;
    }
}