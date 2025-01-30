public class Question3b {
    public static void main(String[] args) {

        int base = 300;
        int word = 1;
        int lowerBound = 5;

        int[] indices = {15, 35, 55};

        for (int index : indices) {
            int address = base + (index - lowerBound) * word;
            System.out.println("The address of AAA[" + index + "] is: " + address);
        }
    }
}
