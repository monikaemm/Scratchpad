package timetable;

import javax.swing.*;

/**
 * Created by MiluchM on 2015-11-19.
 */
public class App {
    public static void main(String[] args) {

        ListService service = new ListService();


        Menu menu = new Menu(service);



        while(true) {
            menu.wyswietl();

            String wybor = "";
            wybor = JOptionPane.showInputDialog("Wybierz nr polecenia:");

            if(wybor.equals("1")){

            Task newTask = getNewTask();


            if(newTask != null) {
                service.add(newTask);
            }}
            else if(wybor.equals("2")){

                Task i = service.allTasks().get(0);
                service.remove(i);
            }
            else if(wybor.equals("3")){

                String removeTask = removeSingleTask();
                Integer removable = Integer.parseInt(removeTask);
                Task i = service.allTasks().get(removable);
                service.remove(i);
            }
            else if(wybor.equals("4")){
                break;
            }
            else{
                break;
            }
            System.out.println("----------");
        }




}

    private static Task getNewTask() {
        String taskDescription = JOptionPane.showInputDialog("Dodaj zadanie:");
        if(taskDescription != null) {
            return new Task(taskDescription, 0);
        }
        else{
            return null;
        }
    }

    private static void removeTask(){
        String taskDescription = JOptionPane.showInputDialog("Usun zadanie:");

    }

    private static String removeSingleTask(){
        String taskDescription = JOptionPane.showInputDialog("Podaj zadanie do usuniecia:");

       return taskDescription;
    }

    private static void generateTasks(ListService service) {

        for(int i = 0; i < 3; i++){
            Task task = new Task("opis "+(i+1), i);
            service.add(task);

        }
    }


}





