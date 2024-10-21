package Views;

import java.util.Scanner;
import models.Person;

public class View {

    private Scanner scanner
    
    scanner = new Scanner(System.in);
    public int showMenu(){
        System.out.println("MENU");
        System.out.println("1. Ingresar persona");
        System.out.println("1OO SALIR");
        return scanner.nextInt();
    }
    public int inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public Person inputPerson(){
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
        
    }
    public String inputName(){
        System.out.println("INGRESE EL NOMBRE: ");
        return scanner.next();
    }

    public int inputAge(){
        return inputInt("ingrese la edad");
    }

    public int inputInt(String message){
        System.out.println("Ingrese la edad: ");
        return scanner.nextInt();
    }
    
}
