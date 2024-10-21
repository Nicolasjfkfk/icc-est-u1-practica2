package Views;

import java.util.Scanner;

public class View {

    private Scanner scanner
    
    scanner = new Scanner(System.in);
    public int showMenu(){
        System.out.println("MENU");
        System.out.println("1. Ingresar persona");
        System.out.println("1OO SALIR");
        return scanner.nextInt()
    }
    public int inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    
}
