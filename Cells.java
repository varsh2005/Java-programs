import java.util.*;
public class Cells{
  public static int[] cellsCompare(int[] cells, int days){
    int length = cells.length;
    int[] temp = new int[length];
    for(int i=0;i<days;i++){
      for(int j=0;j<length;j++){
        int leftNeigh, rightNeigh;
        if(j == 0){
          leftNeigh = 0;
        }
        else{
          leftNeigh = cells[j-1];
        }
        if(j == length-1){
          rightNeigh = 0;
        }
        else{
          rightNeigh = cells[j+1];
        }
        if(leftNeigh == rightNeigh){
          temp[j] = 0;
        }
        else{
          temp[j] = 1;
        }
      }
      for(int k=0;k<length;k++){
        cells[k] = temp[k];
      }
    }
    return cells;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of days: ");
    int days = sc.nextInt();
    int[] arr = new int[8];
    for(int i=0;i<8;i++){
      arr[i] = sc.nextInt();
    }
    int[] result = cellsCompare(arr,days); 
    System.out.println(Arrays.toString(result)); 
  }
}
