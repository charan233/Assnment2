import java.util.Arrays;

public class AddSum {
    public static void main(String[] args)
     {
        int[] arr = {20, 25, 30, 12, 6, 40};
        int n = arr.length;
        for (int i = 1; i < n; i++)
         {
            arr[i] += arr[i - 1];
        }
        System.out.println("Cumulative Sum Array: " + Arrays.toString(arr));
    }
}

