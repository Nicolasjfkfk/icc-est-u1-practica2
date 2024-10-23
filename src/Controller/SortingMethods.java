package Controller;

import models.Person;

public class SortingMethods {
    public void sortByNameWithBubble(Person[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getName().compareTo(personas[j + 1].getName()) > 0) {
                    // Intercambiar
                    Person temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    public void sortByAgeWithSelection(Person[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (personas[j].getAge() < personas[minIdx].getAge()) {
                    minIdx = j;
                }
            }
            // Intercambiar
            Person temp = personas[minIdx];
            personas[minIdx] = personas[i];
            personas[i] = temp;
        }
    }
}