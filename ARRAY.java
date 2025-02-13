import java.util.Scanner;

public class ARRAY{
    public static void main(String[] args) {
        ARRAY a = new ARRAY();
        Scanner input = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a number: ");
            nums[i] = input.nextInt();
        }
        boolean result = a.firstLast6(nums);
                System.out.println(result);
               
 }
public static boolean firstLast6(int[] nums) {
  return (nums[0] == 6) || (nums[nums.length-1] == 6);
}
}

