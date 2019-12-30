package ua.nure.popova.practice1;

public class Part6 {

    private static final int LOCAL = 2;

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] arrayPrimers = new int[x];
        int lastPrime = 2;
        for (int i = 0; i < arrayPrimers.length; i++) {
            while (!isSimple(lastPrime)) {
                lastPrime++;
            }
            arrayPrimers[i] = lastPrime;
            lastPrime++;
        }
        printer(arrayPrimers);
        System.out.println();
    }

    private static void printer(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static boolean isSimple(int num) {
        for (int i = LOCAL; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
