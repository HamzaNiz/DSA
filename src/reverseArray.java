public class reverseArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length -1;
        System.out.println("Array: "+ java.util.Arrays.toString(arr));

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.println("Reversed array: "+ java.util.Arrays.toString(arr));
    }
}
