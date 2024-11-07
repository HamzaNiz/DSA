public class FindingMissingNumber{
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int n = 5;
        int totalSum = n * (n+1)/2;
        int arraySum = 0;
        for (int i = 0;i< arr.length;i++){
            arraySum += arr[i];
        }
        int missingNumber = totalSum- arraySum;
        System.out.println("Missing Number: "+missingNumber);
    }
}