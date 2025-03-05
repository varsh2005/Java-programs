public class SymmetricPairs {
  public static void main(String[] args){
    int[][] arr = {
      {1,2},
      {2,1},
      {1,3},
      {2,4},
      {4,2}
    };
    int n = arr.length;
    for(int i=0;i<n;i++){
      int a = arr[i][0];
      int b = arr[i][1];
      for(int j=i+1;j<n;j++){
        int c = arr[j][0];
        int d = arr[j][1];
        if(a==d && b==c){
          System.out.println(a +","+ b);
          System.out.println(c +"," + d);
        }
      }
    }
  }
}
