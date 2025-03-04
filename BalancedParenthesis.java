import java.util.*;
/*public class BalancedParenthesis {
  public static boolean isbalanced(String str){
    Stack<Character> stack = new Stack<>();
    for(char ch: str.toCharArray()){
      if(ch == '('){
        stack.push(ch);
      }
      else if(ch == ')'){
        if(stack.isEmpty() || stack.pop() != '('){
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
  public static void main(String[] args){
    String str1 = "(())";
    String str2 = "((()";
    System.out.println(str1 + " is balanced: " + isbalanced(str1));
    System.out.println(str2 + " is balanced: " + isbalanced(str2));    
  }
}*/

public class BalancedParenthesis{
  public static boolean bal(String str){
    Stack<Character> stack = new Stack<>();
    for(char ch: str.toCharArray()){
      if(ch=='('){
        stack.push();
      }
      else if(ch == ')'){
        if(stack.isEmpty() || stack.pop != '('){
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
  public static void main(String[] args){
    String str1 = "(())";
    System.out.println(bal(str1));
  }
}
