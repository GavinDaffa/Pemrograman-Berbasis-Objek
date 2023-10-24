import java.util.Scanner;

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

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilih jenis kendaraan (1: Kendaraan, 2: Mobil, 3: Sepeda Motor): ");
        int choice = scanner.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Vehicle();
        } else if (choice == 2) {
            vehicle = new Car();
        } else if (choice == 3) {
            vehicle = new Motorcycle();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        vehicle.display();
    }
}
