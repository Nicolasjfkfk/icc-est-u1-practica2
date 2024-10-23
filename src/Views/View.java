package Views;

import java.util.Scanner;
import models.Person;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int showMenu() {
        System.out.println("\nMENU");
        System.out.println("1. Ingresar personas");
        System.out.println("2. Adicionar personas");
        System.out.println("3. Ordenar personas");
        System.out.println("100. SALIR");
        return scanner.nextInt();
    }

    public int inputInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public Person inputPerson() {
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

    public String inputName() {
        System.out.println("INGRESE EL NOMBRE: ");
        scanner.nextLine(); // Limpiar el buffer
        return scanner.nextLine();
    }

    public int inputAge() {
        return inputInt("Ingrese la edad: ");
    }

    public int selectSortingMethods() {
        System.out.println("**** Ingrese la condicion a ordenar ***");
        System.out.println("1. Por nombre");
        System.out.println("2. Por edad");
        System.out.println("Ingresar una opcion: ");
        return scanner.nextInt();
    }
}