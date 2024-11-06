public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " рублей");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 20:00", 500);
        Attraction bumperCars = park.new Attraction("Автодром", "11:00 - 21:00", 200);
        Attraction horrorHouse = park.new Attraction("Дом страха", "12:00 - 22:00", 400);

        rollerCoaster.printInfo();
        bumperCars.printInfo();
        horrorHouse.printInfo();
    }
}