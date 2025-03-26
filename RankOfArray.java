import java.util.*;
public class RankOfArray {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int[] arr2 = arr.clone();
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr2[i]>arr2[j]){
          int temp = arr2[i];
          arr2[i] = arr2[j];
          arr2[j] = temp;
        }
      }
    }
    int[] rank = new int[n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(arr[i] == arr2[j]){
          rank[i] = j+1;
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.println(rank[i]);
    }
  }
}
