import java.util.*;
public class SentenceCheck {
  public static void main(String[] args) {
    String input1 = "hey diksha hello";
    String input2 = "hey sameeddiksha helloworld";

    String[] words = input1.split(" ");

    // Assume all words are found
    boolean allFound = true;

    // Check each word in input1 against input2
    for (int i = 0; i < words.length; i++) {
        if (!input2.contains(words[i])) {
            allFound = false;
            break;
        }
    }

    // Print result
    if (allFound) {
        System.out.println(input1);
    } else {
        System.out.println("NONE");
    }
  }
}
