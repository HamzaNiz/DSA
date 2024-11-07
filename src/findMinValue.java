public class findMinValue{
    public static void main(String[] args){
        int[] arr = {5,6,4,7,2,8};
        int min = arr[0];
        for (int i = 1; i< arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int minimumValue = min;
        System.out.println("The minimum value in array is: "+ minimumValue);
    }
}