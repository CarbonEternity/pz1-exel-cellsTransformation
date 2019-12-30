package ua.nure.popova.practice1;

public class Part5 {

    private static final int VALUE = 10;

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int sum = 0;
        while (x != 0) {
            sum = sum + (x % VALUE);
            x = x / VALUE;
        }
        System.out.println(sum);
    }
}
