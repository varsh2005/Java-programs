import java.util.Scanner;
public class MaxOccurrenceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().trim();  
        int[] freq = new int[256]; 
        int maxCount = 0;
        char maxChar = str.charAt(0); 
        for(char c : str.toCharArray()){
            freq[c]++;
            if(freq[c]>maxCount){
                maxCount = freq[c];
                maxChar = c;
            }
        }
        System.out.println("Character with maximum occurrence: '" + maxChar + "' occurred " + maxCount + " times");
        sc.close();
    }
}
