public class DistinctArray {
  public static void main(String[] args){
    int[] arr = {1,1,2,2,3,4,4,5,5};
    int n = arr.length;
    for(int i=1;i<=n;i++){
      if((i==1) || (arr[i]!=arr[i-1])){
        System.out.println(arr[i]);
      }
      else{
        continue;
      }
    }
  }
}
