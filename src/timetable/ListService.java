package timetable;

import java.util.List;

/**
 * Created by MiluchM on 2015-11-19.
 */
public class ListService {

    private TaskRepo taskRepo;

    public ListService(){
        taskRepo = new TaskRepo();
    }

    public List<Task> allTasks() {
        return taskRepo.getAllTasks();
    }

    public void add(Task task) {
        taskRepo.add(task);
    }

    public void remove (Task i){ taskRepo.remove(i);}
}
