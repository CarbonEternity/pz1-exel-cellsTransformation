package ua.nure.popova.practice1;

public class Part2 {

    public static void main(String[] args) {
        int[] numArr = new int[args.length];
        int sum =0;
        for (int i = 0; i < args.length; i++) {
            numArr[i] = Integer.parseInt(args[i]);
            sum += numArr[i];
        }
        System.out.println(sum);
    }

}
