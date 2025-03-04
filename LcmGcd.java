import java.util.*;
public class LcmGcd {
  public static int lcmgcd(int a, int b){
    int gcd = 1;
    for(int i=1; i<=a && i<=b; i++){
      if((a%i==0) && (b%i==0)){
        gcd = i;
      }
    }
    System.out.println("GCD: " + gcd);
    int lcm = (a*b)/gcd;
    System.out.println("LCM: " + lcm);
    return 0;
  }
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    lcmgcd(num1,num2);
  }
}
