import java.util.*;
public class SinkingShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        String[] roles = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and role separated by space: ");
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input, try again.");
                i--; //retry this iteration
                continue;
            }
            names[i] = parts[0];
            roles[i] = parts[1].toLowerCase();
        }
        for (int i = 0; i < n; i++) {
            if (roles[i].equals("rat")) {
                System.out.println(names[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (roles[i].equals("women") || roles[i].equals("kid")) {
                System.out.println(names[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (roles[i].equals("captain")) {
                System.out.println(names[i]);
            }
        }
    }
}
