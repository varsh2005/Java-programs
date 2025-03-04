public class Pattern1 {
  public static void main(String[] args){
    ptrn(4);
    ptrn1(4);
    ptrn2(4);
  }
  static void ptrn(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }
  static void ptrn1(int n1){
    for(int i=1;i<=n1;i++){
      for(int j=1;j<=n1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }
  static void ptrn2(int n2){
    for(int i=1;i<=n2;i++){
      for(int j=1;j<=n2-i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }
}
