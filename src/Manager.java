public class Manager extends TeamMember{
    
    public Manager(String name, String workHours){
        super(name, workHours);
        role = "Manager";
    }

    @Override
    public void performDuties(Project project, String status){
        for(Task task : project.getTasksByName(status)){

        }
    }

    public void assignTask(Worker worker, Task task){
        
    }

    public void checkProgress(Project project){

    }
}
