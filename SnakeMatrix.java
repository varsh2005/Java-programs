import java.util.*;
public class SnakeMatrix{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] matrix = new int[n][n];
    int val=1;
    for(int i=0;i<n;i++){
      if(i%2!=0){
        for(int j=n-1;j>=0;j--){
          matrix[i][j] = val++;
        }
      }
      else{
          for(int j=0;j<n;j++){
            matrix[i][j] = val++;
          }
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}