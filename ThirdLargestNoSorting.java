import java.util.*;
public class ThirdLargestNoSorting {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    int thirdlargest = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(arr[i]>largest){
        thirdlargest = secondlargest;
        secondlargest = largest;
        largest = arr[i];
      }
      else if(arr[i]>secondlargest && arr[i]!=largest){
        thirdlargest = secondlargest;
        secondlargest = arr[i];
      }
      else if(arr[i]>thirdlargest && arr[i]!=secondlargest && arr[i]!=largest){
        thirdlargest = arr[i];
      }
    }
    if(thirdlargest == Integer.MIN_VALUE){
      System.out.println("No third largest element found");
    }
    else{
      System.out.println(thirdlargest);
    }
  }
}
