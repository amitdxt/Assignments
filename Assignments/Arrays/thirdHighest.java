class thirdHighest {
    static void thirdLargest(int arr[], int arr_size) {
        if (arr_size < 3) {
            System.out.printf(" Invalid Input ");
            return;
        }
       
        int first = arr[0], second = Integer.MIN_VALUE,
                            third = Integer.MIN_VALUE;
       
        for (int i = 1; i < arr_size; i++) {
           
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } 
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } 
            else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.printf("The third Largest element is %d\n", third);
    }
   
    public static void main(String []args) {
        int arr[] = {12, 13, 1, 10, 34, 16};
        int n = arr.length;
        thirdLargest(arr, n);
    }
}