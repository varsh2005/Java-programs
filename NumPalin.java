import java.util.*;
class NumPalin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Original number: ");
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        System.out.println("Reversed number: "+rev);
        if(num == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}



