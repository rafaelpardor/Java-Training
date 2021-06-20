class main {
  public static void main(String args[]){
    System.out.println("Function Sum Array return the sum of all the elements of the integer Array.");
    int[] arr = {1,2,3,4,5,5,6,7};
    System.out.printf("Sum of values in array: %d \n", SumArray(arr));
  }
  static int SumArray(int arr[]) {
    int size = arr.length;
    int total = 0;
    for (int i = 0; i < size; i++) {
      total = total + arr[i];
    }
    return total;
  }
}
