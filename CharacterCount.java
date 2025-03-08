import java.util.*;
public class CharacterCount {
  static void charCount(String s){
    int vowels=0, consonants=0, digits=0, specialChar=0;
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
        ch = Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
          vowels++;
        }
        else{
          consonants++;
        }
      }
      else if(ch>='0' && ch<='9'){
        digits++;
      }
      else{
        specialChar++;
      }
    }
    System.out.println("Vowels: "+vowels);
    System.out.println("Consonants: "+consonants);
    System.out.println("Digits: "+digits);
    System.out.println("Special Characters: "+specialChar);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    charCount(str);
  }
}
