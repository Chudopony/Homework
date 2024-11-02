public class Task10 {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}