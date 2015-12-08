package timetable;

import java.util.*;
import java.util.List;

/**
 * Created by MiluchM on 2015-11-19.
 */
public class TaskRepo {

    private List<Task> tasks;

    public TaskRepo() {
        tasks = new ArrayList<>();
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void remove(Task i){ tasks.remove(i);}

    public List<Task> getAllTasks() {
        // return null;
        return tasks;
    }
}
