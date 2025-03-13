import java.util.ArrayList;
public class Main {
    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                resultList.add(array[i]);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 3, 4, 5, 6, 7};
        int[] array3 = {7, 8, 9, 10, 11};
        printArray(filterEvenIndexOddValue(array1));
        printArray(filterEvenIndexOddValue(array2));
        printArray(filterEvenIndexOddValue(array3));
    }
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
