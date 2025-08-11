class animal {
    String colour;

    void eat() {
        System.out.println("eats");
    }

    void breathes() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("fish swims");
    }
}

public class Ma {  // Renamed from Animal to Main
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathes();
        shark.swim();
    }
}
