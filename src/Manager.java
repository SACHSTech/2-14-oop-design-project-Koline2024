public class Manager extends TeamMember{
    
    public Manager(String name, String workHours){
        super(name, workHours);
        role = "Manager";
    }

    public void getTasksToDo(Project project){
        System.out.println("Address these issues: ");
        for(Task task : project.getTasksByStatus("Stuck")){
            System.out.println(task);
        }
    }

    public void assignTask(Worker worker, Task task){
        task.addWorker(worker);
    }

    public void checkProgress(Project project){
        for(Task task : project.getAllTasks()){
            System.out.println(task);
        }
    }
}
