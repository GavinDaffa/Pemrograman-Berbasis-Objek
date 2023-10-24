// Superclass (kelas induk)
class Vehicle {
    void display() {
        System.out.println("Ini adalah kendaraan.");
    }
}

// Subclass (kelas turunan)
class Car extends Vehicle {
    void display() {
        System.out.println("Ini adalah mobil.");
    }
}

// Subclass lainnya (kelas turunan)
class Motorcycle extends Vehicle {
    void display() {
        System.out.println("Ini adalah sepeda motor.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        vehicle.display(); // Menampilkan "Ini adalah kendaraan."
        car.display(); // Menampilkan "Ini adalah mobil."
        motorcycle.display(); // Menampilkan "Ini adalah sepeda motor."
    }
}

