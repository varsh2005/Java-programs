import java.util.*;
public class Capitalised {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] ch = str.toCharArray();
    for(int i=0;i<ch.length;i++){
      if(ch[i]!=' '){
        int start = i;
        while(i<ch.length && ch[i]!=' '){
          i++;
        }
        ch[start] = Character.toUpperCase(ch[start]);
        ch[i-1] = Character.toUpperCase(ch[i-1]);
      }
    }
    System.out.println(ch);
    sc.close();
  }
}
