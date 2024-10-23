package Controller;

import models.Person;
import Views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private Person[] personas;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        view.showMessage("Iniciando el programa...");
    }

    public void start() {
        int option = 0;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    sortPerson();
                    break;
                case 100:
                    System.out.println("ADIOS");
                    option = 0; // Para salir del bucle
                    break;
                default:
                    System.out.println("Ingrese otra opcion");
            }
        } while (option != 0);
    }

    private void sortPerson() {
        if (personas == null || personas.length == 0) {
            view.showMessage("No hay personas para ordenar");
            return;
        }
        int sortingOption = view.selectSortingMethods();
        if (sortingOption == 1) {
            sortingMethods.sortByNameWithBubble(personas);
        } else if (sortingOption == 2) {
            sortingMethods.sortByAgeWithSelection(personas);
        }
        // Mostrar resultado
        view.showMessage("Personas ordenadas:");
        for (Person p : personas) {
            view.showMessage(p.toString());
        }
    }

    public void inputPersons() {
        int numeroPersonas = view.inputInt("INGRESE EL NUMERO DE PERSONAS: ");
        personas = new Person[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson();
        }
    }

    public void addPerson() {
        if (personas == null) {
            view.showMessage("No existe el arreglo de personas");
            inputPersons();
        } else {
            int numeroPersonas = view.inputInt("INGRESE EL NUMERO DE PERSONAS a adicionar: ");
            Person[] personasTotales = new Person[personas.length + numeroPersonas];
            // Copiar personas existentes
            for (int i = 0; i < personas.length; i++) {
                personasTotales[i] = personas[i];
            }
            // Añadir nuevas personas
            for (int i = personas.length; i < personasTotales.length; i++) {
                personasTotales[i] = view.inputPerson();
            }
            personas = personasTotales;
        }
    }
}