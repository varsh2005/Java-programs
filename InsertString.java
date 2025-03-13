import java.util.*;
public class InsertString {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str = sc.nextLine();
    System.out.println("Enter the String to be inserted: ");
    String insertStr = sc.nextLine();
    System.out.println("Enter the Index: ");
    int index = sc.nextInt();
    if(index<0){
      index = 0;
    }
    if(index>str.length()){
      index = str.length();
    }
    StringBuilder sb = new StringBuilder(str);
    sb.insert(index, insertStr);
    System.out.println(sb.toString());
    sc.close();
  }
}
