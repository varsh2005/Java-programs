import java.util.*;
public class MinMax {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] word = str.split("\\s+");
    String max = word[0];
    String min = word[0];
    for(String words : word){
      if(words.length()<min.length()){
        min = words;
      }
      if(words.length()>max.length()){
        max = words;
      }
    }
    System.out.println(min);
    System.out.println(max);  
  }
}
