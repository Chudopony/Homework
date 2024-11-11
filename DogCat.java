abstract class Animal {
    protected static int animalCount = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 0; 
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean isFull() {
        return isFull;
    }

    public void eatFromBowl(FoodBowl bowl) {
        if (!isFull && bowl.getFoodAmount() >= 10) {
            bowl.decreaseFood(10);
            isFull = true;
            System.out.println(name + " поел из миски и теперь сыт.");
        } else if (isFull) {
            System.out.println(name + " уже сыт.");
        } else {
            System.out.println("В миске недостаточно еды для " + name);
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        } else {
            foodAmount = 0;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }
}

public class DogCat {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog.run(150);
        dog.swim(5);

        cat1.run(100);
        cat1.swim(5);

        FoodBowl bowl = new FoodBowl(20);
        cat1.eatFromBowl(bowl);
        cat2.eatFromBowl(bowl);

        bowl.addFood(15);

        cat1.eatFromBowl(bowl);
        cat2.eatFromBowl(bowl);

        System.out.println("Создано животных: " + Animal.getAnimalCount());
        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Создано котов: " + Cat.getCatCount());
    }
}

