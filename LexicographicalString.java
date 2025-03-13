import java.util.*;
public class LexicographicalString {
  public static String lexi(String str){
    if(str.equals(""))
    return "a";
    int i = str.length()-1;
    while(i>=0 && str.charAt(i) == 'z')
    i--;
    if(i == -1){
      return str+"a";
    }
    else{
      return str.substring(0,i) + (char)(str.charAt(i)+1) + str.substring(i+1);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(lexi(str));
  }
}

