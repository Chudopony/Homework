public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИ: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иван Петров", "Программист", "ivan.ivanov@mail.com", "89081234567", 75000, 30);
        persArray[1] = new Person("Анна Соколова", "Менеджер", "anna@mail.com", "89081234567", 85000, 38);
        persArray[2] = new Person("Петр Смирнов", "Дизайнер", "petr@mail.com", "89081334567", 60000, 20);
        persArray[3] = new Person("Елена Кузнецова", "Аналитик", "kuzya@mail.com", "89086334567", 70000, 42);
        persArray[4] = new Person("Сергей Сергеев", "QA", "serg@mail.com", "89086394567", 50000, 23);

        for (Person person : persArray) {
            person.printInfo();
        }
    }
}