import java.util.*;
public class StrDots {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str = str.replaceAll("^\\.+|\\.+$","");
    String[] words = str.split("\\.+");
    StringBuilder s = new StringBuilder();
    for(int i=words.length-1; i>=0; i--){
      s.append(words[i]);
      if(i!=0){
        s.append(".");
      }
    }
    System.out.println(s.toString());
    sc.close();
  }
}
