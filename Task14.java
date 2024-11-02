public class Task14 {
    public static void main(String[] args) {
        int[] result = createArray(5, 7); 
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len]; 
        for (int i = 0; i < len; i++) {
            array[i] = initialValue; 
        }
        return array;
    }
}