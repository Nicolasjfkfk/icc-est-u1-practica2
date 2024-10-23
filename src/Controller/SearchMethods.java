package Controller;

import models.Person;

public class SearchMethods {
    public Person searchByName(Person[] personas, String name) {
        for (Person persona : personas) {
            if (persona.getName().equalsIgnoreCase(name)) {
                return persona;
            }
        }
        return null;
    }
}