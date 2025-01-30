public class Question3a {
    public static void main(String[] args) {

        int AAA_lowerBound = 5, AAA_upperBound = 50;
        int BBB_lowerBound = -5, BBB_upperBound = 10;
        int CCC_elements = 1;

        int AAA_elements = AAA_upperBound - AAA_lowerBound + 1;
        int BBB_elements = BBB_upperBound - BBB_lowerBound + 1;

        System.out.println("Number of elements in AAA(5:50): " + AAA_elements);
        System.out.println("Number of elements in BBB(-5:10): " + BBB_elements);
        System.out.println("Number of elements in CCC(18): " + CCC_elements);
    }
}
