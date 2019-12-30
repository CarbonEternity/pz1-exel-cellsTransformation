package ua.nure.popova.practice1;

public class Part7 {

    private static final int LAST_INDEX = 26;

    public static void main(String[] args) {
        if (args.length > 1) {
            String value = args[0];
            int number = Integer.parseInt(args[1]);
            System.out.println(str2int(value));
            System.out.println(int2str(number));
            System.out.println(rightColumn(value));
        } else {
            defaultFunc();
        }
    }

    static void defaultFunc() {
        String[] arg = new String[]{"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"};
        int tmp;
        String value;
        for (int i = 0; i < arg.length; i++) {
            value = arg[i];
            tmp = str2int(arg[i]);
            System.out.println(value + " ==> " + tmp + " ==> " + int2str(tmp));
        }
    }

    public static int str2int(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result *= LAST_INDEX;
            result += number.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static String int2str(int number) {
        number--;
        if (number >= 0 && number < LAST_INDEX) {
            return String.valueOf(((char) ('A' + number)));
        }
        return int2str(number / LAST_INDEX) + int2str(number % LAST_INDEX + 1);
    }

    public static String rightColumn(String number) {
        int current = str2int(number);
        return int2str(current + 1);
    }

}



