public class Question1 {
    public static void main(String[] args) {
        String[] names = {"Adam", "Clark", "Evans", "Salim", "Jones", "Lane", "Pace", "Smith"};
        int[] target = {1, 3, 6};

        for (int i = 0; i < target.length; i++) {
            if (target[i] >= 0 && target[i] < names.length) {
                System.out.println("The name at index " + (target[i] + 1) + " is: " + names[target[i]]);
            } else {
                System.out.println("Invalid index: " + (target[i] + 1));
            }
        }
    }
}
