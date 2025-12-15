import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(sumOfArray(nums)));
    }

    public static int[] sumOfArray(int[] array) {
        int[] newArray = new int[array.length];
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
            newArray[i] = totalSum;
        }
        return newArray;
    }
}
