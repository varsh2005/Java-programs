import java.util.*;
public class AutomorphicNo {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sqr = n*n;
    int num = n;
    int digit = 0;
    while(n>0){
      int rem = n%10;
      digit++;
      n/=10;
    }
    int tens = (int)Math.pow(10,digit);
    int lastdig = sqr%tens;
    if(num == lastdig){
      System.out.println("Automorphic number");
    }
    else{
      System.out.println("Not an Automorphic number");
    }
  }
}
