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
        
      System.out.println("CONTROLLER CREATE");
    }
    
}
