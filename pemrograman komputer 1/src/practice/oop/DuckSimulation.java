package practice.oop;

import java.util.Scanner;

public class DuckSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Pilih jenis duck (1. Mallard Duck, 2. Rubber Duck, 3. Decoy Duck, 4. Model Duck):");
        int choice = scanner.nextInt();

        Duck selectedDuck = null;

        switch (choice) {
            case 1:
                selectedDuck = new  MallardDuck();
                break;
            case 2:
                FlyBehavior cantFly = () -> System.out.println("I can't fly");
                QuackBehavior squeak = () -> System.out.println("Squeak");
                selectedDuck = new RubberDuck(cantFly,squeak);
                break;
            case 3:
                selectedDuck = new DecoyDuck();
                break;
            case 4:
                selectedDuck = new ModelDuck();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        selectedDuck.display();
        selectedDuck.performFly();
        selectedDuck.performFly();
    }
}
