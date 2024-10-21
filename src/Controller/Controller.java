package Controller;
import models.Person;
import Views.View;

public class Controller {

    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    private Person[] personas;

    public Controller (View view, SortingMethods sortingMethods, SearchMethods searchMethods ){
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        
      System.out.println(Iniciando);

      public void star (){
        int option = 0;
        do{
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons()
                   break;
                case 2:
                    addPerson()
                   break;
                case 100:
                   System.out.println("ADIOS");
                   break;
                default:
                System.out.println("ingrese otra opcion");
                   
            }
        }while (opcion !=0);
    }

    public void inputPersons(){
    int numeroPersonas = view.inputInt("INGRESE EL NUMERO DE PERSONAS: ");
    personas = new person[numeroPersonas];
    for (int i =0; i<numeroPersonas; i++){
        personas[i] = view.inputPerson();
      }
    }

    public void addPerson(){
        int numeroPersonas = view.inputInt("INGRESE EL NUMERO DE PERSONAS a adicionar: ");
  } 
}
