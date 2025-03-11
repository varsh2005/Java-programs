import java.util.*;
public class Anagrams {
  static boolean strAnagrams(String s1, String s2){
    char[] ch1 = s1.toCharArray();
    char[] ch2 = s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    System.out.println(strAnagrams(s1,s2));
    sc.close();
  }
}
