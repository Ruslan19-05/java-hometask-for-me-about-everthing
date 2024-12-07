package az.edu.turing.OOP;

class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Cars {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

class Mainns {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.drive();
    }
}

