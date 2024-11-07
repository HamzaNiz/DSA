public class secondMaxValue{
    public static void main(String[] args) {
        int[] arr = {4,5,67,8,99};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i] ;
            } else if ( arr[i] >max2  && arr[i] != max1){
                max2 = arr[i];
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("There is no second value in the array");
        }else{
            System.out.println("The max value in the array is: "+ max1);
            System.out.println("The Second max value in the array is: "+ max2);
        }
    }

}
