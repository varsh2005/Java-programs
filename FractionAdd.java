import java.util.Scanner;

public class FractionAdd {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("First fraction: ");
    int a = sc.nextInt();
    System.out.println("--");
    int b = sc.nextInt();
    System.out.println("Second fraction: ");
    int c = sc.nextInt();
    System.out.println("--");
    int d = sc.nextInt();
    int numer = (a*d)+(b*c);
    int denom = (b*d);
    int gcd = 0;
    for(int i=1; i<=numer&&i<=denom; i++){
      if(numer%i==0 && denom%i==0){
        gcd = i;
      }
    }
    int n = numer/gcd;
    int de = denom/gcd;
    System.out.println(n +"/"+de);
    sc.close();
  }
}
