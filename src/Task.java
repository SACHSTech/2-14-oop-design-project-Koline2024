import java.util.ArrayList;

public class Task{

    private String name;
    private String status;
    private String deadline;
    private ArrayList<Task> dependency;
    
    public Task(String name, String deadline, ArrayList<Task> dependency){
        this.name = name;
        this.deadline = deadline;
        this.dependency = new ArrayList<>();
        for(Task task : dependency){
            this.dependency.add(new Task(task.getName(), task.getDeadLine(), task.getDependency()));
        }
    }

    public String getName(){
        return name;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String input){
        status = input;
    }

    public String getDeadLine(){
        return deadline;
    }

    public ArrayList<Task> getDependency(){
        return dependency;
    }

    public void addDependency(Task task){
        dependency.add(task);
    }

    public String toString(){
        return name + "( " + status + " ) Due By:" + deadline;
    }





}