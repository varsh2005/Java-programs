import java.util.*;
public class NoOfOccurence {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter the number to count the number of occurences:");
    int target = sc.nextInt();
    int count = 0;
    int rem = 0;
    while(n!=0){
      int digit = n%10;
      if(digit == target){
        count++;
      }
      n/=10;
    }
    System.out.println("Number of time "+target+ " is repeated: "+count);
  }
}
