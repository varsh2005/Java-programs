import java.util.*;
public class StrongNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = n;
    int sum =0;
    while(n>0){
      int dig = n%10;
      int fact =1;
      for(int i=1;i<=dig;i++){
        fact = fact*i;
      }
      sum+=fact;
      n/=10;
    }
    if(sum == num){
      System.out.println("Strong number");
    }
    else{
      System.out.println("Not a Strong number");
    }
  }
}
