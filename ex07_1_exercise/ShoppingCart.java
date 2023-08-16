package ex07_1_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        int spaceIdx = custName.indexOf(" ");
        String firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);

        StringBuilder sb = new StringBuilder(firstName);

        sb.append(" Austin");

        System.out.println(sb);

        long longValue = 13213213123123L;
        float price = 20.25f;
        char myChar = 'U';

        System.out.println(longValue);
        int int1 = (int) longValue;

        System.out.println(int1);



    }
}
