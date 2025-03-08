import java.util.Scanner;

public class AsciChar{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    int asci=ch;
    System.out.println(asci);
  }
}