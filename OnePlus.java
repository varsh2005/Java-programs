import java.util.*;
class OnePlus {
    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        for(int i=last; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args){
      int[] digits = {9,9};
      int[] digits2 = {1,2,3};
      OnePlus a = new OnePlus();
      int[] result = a.plusOne(digits);
      int[] result2 = a.plusOne(digits2);
      System.out.println(Arrays.toString(result));
      System.out.println(Arrays.toString(result2));
    }
}