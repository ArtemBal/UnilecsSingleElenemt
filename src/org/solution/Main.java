package org.solution;

public class Main {
    public static int singleNumber(int[] nums) {
        int single = 0;
        int twice = 0;

        for (int num : nums) {
            System.out.println("num - " + num);
            single = (single ^ num) & ~twice;
            System.out.println("single - " + single);
            twice = (twice ^ num) & ~single;
            System.out.println("twice - " + twice);
            System.out.println("_____________________");
        }

        return single;
    }
    public static void main(String[] args) {
        int[] array = {2,5,2,3,5,2,5};
        System.out.println(singleNumber(array));
    }
}