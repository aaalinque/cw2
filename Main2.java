public class Main2 {
    public static int[] rotateArray(int[] array, int positions) {
        if (array == null || array.length == 0) {
            return array;
        }
        int n = array.length;
        positions = positions % n;

        if (positions == 0) {
            return array;
        }
        int[] rotatedArray = new int[n];
        System.arraycopy(array, n - positions, rotatedArray, 0, positions);
        System.arraycopy(array, 0, rotatedArray, positions, n - positions);
        return rotatedArray;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};
        int[] result1 = rotateArray(array1, 2);
        int[] result2 = rotateArray(array2, 3);
        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
    }
}
