package Views;

import Controller.Controller;
import Controller.SearchMethods;
import Controller.SortingMethods;
import Views.View;

public class App {
    public static void main(String[]arg) throws Exception{
        //CREA LA VISTA
        View vista = new View();

        //CREA LAS CLASES CON LOS METODOS DE ORDENAIENTO Y BUSQUEDA
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        //CONTROLADOR
        Controller controller = new Controller(vista, sortingMethods, searchMethods);

        
    }
    
}
