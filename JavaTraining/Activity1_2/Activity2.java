import java.util.Arrays;


public class Activity2 {
    public static void main(String[] args) {
        int[] numArr = {10, 77, 10, 54, -11, 10};
           System.out.println("Original Array: " + Arrays.toString(numArr));
        
       
        int searchNum = 10;
        int fixedSum = 30;

       
           System.out.println("Result: " + result(numArr, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int sum = 0;
        
        for (int number : numbers) {
            
            if (number == searchNum) {
                
                sum += searchNum;
            }

            
            if (sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return sum == fixedSum;
    }
}