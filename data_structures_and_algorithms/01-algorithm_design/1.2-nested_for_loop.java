class main {
  public static void main(String args[]){
    System.out.println("1.2 Time Complexity: O(n^2), two nested for loop takes quadratic time. \n");
    nestedLoop(5);
  }
  static void nestedLoop(int n){
    int i, j, m = 0;
    for (i = 0; i < n; i++){
      System.out.println(i);
      for (j = 0; j < n; j++) {
        m += 1;
        System.out.println("\t" + m);
      }
    }
  }
}

