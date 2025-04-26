public class Worker extends TeamMember{
    
    public Worker(String name, String workHours){
        super(name, workHours);
        role = "Worker";
    }

   public void performDuties(Project project, String info){
        
   }

   public void updateTaskStatus(String status, Task task){
        task.setStatus(status);
   }
}
