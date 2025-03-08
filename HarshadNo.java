import java.util.*;
public class HarshadNo {
  static void harshadnumber(int num){
    int number = num;
    int sum=0;
    while(num>0){
      int digit = num%10;
      sum += digit;
      num/=10;
    }
    if(number%sum==0){
      System.out.println("Harshad Number");
    }
    else{
      System.out.println("Not a Harshad Number");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    harshadnumber(number);
  }
}
