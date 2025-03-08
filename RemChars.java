import java.util.Scanner;
public class RemChars{
  static void onlyChar(String str){
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if((ch<'A' || ch>'Z') && (ch<'a' || ch>'z')){
        str = str.substring(0, i) + str.substring(i+1);
        i--;
      }
    }
    System.out.println(str);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    onlyChar(str);
  }
}