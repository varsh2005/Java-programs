import java.util.*;
public class PrimeNo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int n = sc.nextInt();
    int []arr = new int[n];
    System.out.println("ArrayElements:");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Prime elements: ");
    for(int i=0;i<n;i++){
      if(isPrime(arr[i])){
        System.out.println(arr[i]);
      }
    }
  }
  public static boolean isPrime(int n){
    if(n<=2){
      return false;
    }
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}