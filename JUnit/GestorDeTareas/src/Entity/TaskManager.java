package Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renem
 */
public class TaskManager {

    public List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }
    
    public void addTask(String task){
        tasks.add(task);
    }
    
    public void removeTask(String task){
        tasks.remove(task);
    }
   
    public List<String> getTask(){
        return tasks;
    }
   

}
