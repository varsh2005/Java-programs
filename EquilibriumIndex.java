import java.util.Scanner;

public class EquilibriumIndex {
  public static int equIndex(int[] arr){
    for(int i=0;i<arr.length;i++){
      int leftsum = 0;
      for(int j=0;j<i;j++){
        leftsum += arr[j];
      }
      int rightsum = 0;
      for(int j=i+1;j<arr.length;j++){
        rightsum += arr[j];
      }
      if(leftsum==rightsum){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int index = sc.nextInt();
    int[] arr = new int[index];
    for(int i=0;i<index;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(equIndex(arr));
  }
}
