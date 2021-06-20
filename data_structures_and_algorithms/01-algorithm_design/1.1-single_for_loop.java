class main {
  public static void main(String args[]){
    System.out.println("1.1 Time complexity: O(n), single loop takes linear time. \n");
    singleLoop(20);
  }
  static void singleLoop(int n){
    int m = 0;
    for (int i = 0; i < n; i++){
      m += 1;
      System.out.println(m);
    }
  }
}

