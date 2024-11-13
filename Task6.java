public class Task6 {
    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void main(String[] args) {
        checkNumber(6);
        checkNumber(-6);
    }
}
