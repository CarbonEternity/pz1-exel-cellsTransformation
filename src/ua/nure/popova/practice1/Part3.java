package ua.nure.popova.practice1;

public class Part3 {

    public static void main(String[] args) {
       String value = util(args).trim();
       System.out.println(value);
    }

    private static String util(String[] args){
        StringBuilder sb = new StringBuilder();
        for (String s :args){
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
