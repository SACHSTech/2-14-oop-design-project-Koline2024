import java.util.ArrayList;

public class Task{

    private String name;
    private String status;
    private String hoursNeeded;
    //private ArrayList<Task> dependency;
    protected ArrayList<Worker> assignedWorkers = new ArrayList<>();
    
    public Task(String name, String hoursNeeded){
        this.name = name;
        this.hoursNeeded = hoursNeeded;
        //this.dependency = new ArrayList<>();
        // for(Task task : dependency){
        //     this.dependency.add(new Task(task.getName(), task.getDeadLine(), task.getDependency()));
        // }
        this.status = "Incomplete";
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
        return hoursNeeded;
    }

    // public ArrayList<Task> getDependency(){
    //     return dependency;
    // }

    // public void addDependency(Task task){
    //     dependency.add(task);
    // }

    public ArrayList<Worker> getAllWorkers(){
        return assignedWorkers;
    }

    public void addWorker(Worker worker){
        assignedWorkers.add(worker);
    }

    public String toString(){
        return name + " (" + status + ") Hours Needed: " + hoursNeeded + " - Assigned To: " + getAllWorkers();
    }

    public boolean isNotYetStarted(){
        if(status.equals("Incomplete")){
            return true;
        }
        return false;
    }

    public boolean isInProgress(){
        if(status.equals("Working")){
            return true;
        }
        return false;
    }

    public boolean isComplete(){
        if(status.equals("Complete")){
            return true;
        }
        return false;
    }

    public boolean isStuck(){
        if(status.equals("Stuck")){
            return true;
        }
        return false;
    }





}