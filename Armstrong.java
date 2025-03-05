import java.util.*;
import java.lang.*;
public class Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int n = num;
    int digit = 0,sum=0;
    while(n>0){
      n = n/10;
      digit++;
    }
    n = num;
    while(n>0){
      int dig = n%10;
      sum += Math.pow(dig,digit);
      n/=10;
    }
    if(sum == num){
      System.out.println("Armstrong number");
    }
    else{
      System.out.println("Not armstrong number");
    }
  }
}
