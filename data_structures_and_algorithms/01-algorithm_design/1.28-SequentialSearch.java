class main {
  public static void main(String args[]){
    System.out.println("Sequential Search over an array for some given value.");
    int[] arr = {1,2,3,4,5,6};
    System.out.println("Find the number over the array: " + SequentialSearch(arr, 6));
  }
  static int SequentialSearch(int arr[], int value) {
    int size = arr.length;
    for (int i = 0; i < size; i++) {
      if (value == arr[i]) {
        return i;
      }
    }
    return -1;
  }
}
