public class Task5 {
    public static boolean compareNumbers (int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        System.out.println(compareNumbers(15, 5));
        System.out.println(compareNumbers(20, 1));
    }
}
