package timetable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MiluchM on 2015-11-21.
 */
public class Menu {

    private ListService listService;

    public Menu(ListService listService) {
        this.listService = listService;
    }

    public void wyswietl() {

        System.out.println("Menu:");
        System.out.println("1. Dodaj zadanie");
        System.out.println("2. Usun zadanie");
        System.out.println("3. Usun konkretne zadanie");
        System.out.println("4. Zakoncz");
        for (Task task : listService.allTasks()) {
            System.out.println(task.getDescription());

        }
    }


}