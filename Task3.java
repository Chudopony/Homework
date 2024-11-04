public class Task3 {
    public static void main (String []args) {
        printColor();
    }
    public static void printColor() {
        int value = 101;
     if (value <= 0){
        System.out.print ("Красный");
    }else if (value > 0 && value <= 100){
        System.out.print ("Желтый");
    }else if (value > 100){
        System.out.print ("Зеленый");
    }  
}
}