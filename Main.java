public class Main {
    public static int[] filterEvenIndexOddValue(int[] array) {

        return new int[0];
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 3, 4, 5, 6, 7};
        int[] array3 = {7, 8, 9, 10, 11};

        printArray(filterEvenIndexOddValue(array1));
        printArray(filterEvenIndexOddValue(array2));
        printArray(filterEvenIndexOddValue(array3));
    }
}
