public class ArrayRotation {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6};
    int d = 4;
    int n = arr.length;
    for(int i=0;i<d;i++){
      int first = arr[0];
      for(int j=0;j<n-1;j++){
        arr[j] = arr[j+1];
      }
      arr[n-1] = first;
    }
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
  }
}
